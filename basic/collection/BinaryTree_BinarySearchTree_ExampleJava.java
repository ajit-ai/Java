package basic.collection;


//package a6_1aa_binaryTree_blog_zigZag_spiral_blog;

import java.io.IOException;
import java.util.Stack;



class Node {
    public int value;
 
    public Node leftChild;
 
    public Node rightChild;
 
    @Override
    public String toString() {
          //return "[value=" + value + ", left=" + leftChild + ", right=" + rightChild + "]";
          return "[value=" + value +"]";
    }
 
}
 
class Tree {
    public Node root; // first node of tree
    // -------------------------------------------------------------
 
    public Tree() // constructor
    {
          root = null;
    } // no nodes in tree yet
          // -------------------------------------------------------------
 
    public void insert(int id) {
          Node newNode = new Node(); // make new node
          newNode.value = id; // insert data
          if (root == null) // no node in root
                 root = newNode;
          else // root occupied
          {
                 Node current = root; // start at root
                 Node parent;
                 while (true) // (exits internally)
                 {
                       parent = current;
                       if (id < current.value) // go left?
                       {
                              current = current.leftChild;
                              if (current == null) // if end of the line,
                              { // insert on left
                                    parent.leftChild = newNode;
                                    return;
                              }
                       } // end if go left
                       else // or go right?
                       {
                              current = current.rightChild;
                              if (current == null) // if end of the line
                              { // insert on right
                                    parent.rightChild = newNode;
                                    return;
                              }
                       } // end else go right
                 } // end while
          } // end else not root
    } // end insert()
          // -------------------------------------------------------------
 
    
 
    // Breadth-First Search //Display output in tree form
    public void displayTree() {
          Stack parentStack = new Stack();
          parentStack.push(root);
          int nBlanks = 32;
          boolean isRowEmpty = false;
          while (isRowEmpty == false) {
 
                 Stack childStack = new Stack();
                 isRowEmpty = true;
                 for (int j = 0; j < nBlanks; j++)
                       System.out.print(' ');
                 while (parentStack.isEmpty() == false) {
                       Node currentNode = (Node) parentStack.pop();
                       if (currentNode != null) {
                           System.out.print(currentNode.value);
                           childStack.push(currentNode.leftChild);
                           childStack.push(currentNode.rightChild);
                              if (currentNode.leftChild != null || currentNode.rightChild != null)
                                    isRowEmpty = false;
                       } else {
                              System.out.print("--");
                              childStack.push(null);
                              childStack.push(null);
                       }
                       for (int j = 0; j < nBlanks * 2 - 2; j++)
                              System.out.print(' ');
                 } // end while parentStack not empty
                 System.out.println();
                 nBlanks /= 2;
                 while (childStack.isEmpty() == false)
                       parentStack.push(childStack.pop());
          } // end while isRowEmpty is false
    }
 
    // Breadth-First Search // Simply- without formatting
 
    public void displayTreeSpiral() {// if null then return
          if (root == null) {
                 return;
          }
 
          // declare two stacks
          Stack<Node> currentLevel = new Stack<Node>();
          Stack<Node> nextLevel = new Stack<Node>();
 
          // push the root
          currentLevel.push(root);
          boolean leftToRight = true;
 
          // check if stack is empty
          while (!currentLevel.isEmpty()) {
                 Node node = currentLevel.pop();
                 
                 System.out.print(node.value + " ");
 
                 // store data according to current order.
                 if (leftToRight) {
                       if (node.leftChild != null) {
                              nextLevel.push(node.leftChild);
                       }
 
                       if (node.rightChild != null) {
                           nextLevel.push(node.rightChild);
                       }
                 } else {
                       if (node.rightChild != null) {
                           nextLevel.push(node.rightChild);
                       }
 
                       if (node.leftChild != null) {
                              nextLevel.push(node.leftChild);
                       }
                 }
                 //if currentLevel is empty than swap currentLevel and nextLevel
                 if (currentLevel.isEmpty()) {
                       leftToRight = !leftToRight;
                       Stack<Node> temp = currentLevel;
                       currentLevel = nextLevel;
                       nextLevel = temp;
                 }
          }
    }
 
}

/**
 * @author ajit
 *
 */
public class BinaryTree_BinarySearchTree_ExampleJava {
 
    public static void main(String[] args) throws IOException {
 
          // Insert
          Tree theTree = new Tree();
          theTree.insert(50);
          theTree.insert(17);
          theTree.insert(72);
          theTree.insert(12);
          theTree.insert(23);
          theTree.insert(54);
          theTree.insert(76);
          theTree.insert(9);
          theTree.insert(14);
          theTree.insert(19);
          theTree.insert(67);
 
          theTree.insert(24);
          theTree.insert(53);
          theTree.insert(75);
          theTree.insert(78);
 
 
          theTree.insert(8);
          theTree.insert(10);
          theTree.insert(13);
          theTree.insert(23);
          theTree.insert(54);
          //theTree.insert();
          theTree.insert(76);
          theTree.insert(15);
          theTree.insert(18);
          theTree.insert(20);
          theTree.insert(25);
          theTree.insert(52);
          theTree.insert(68);
          theTree.insert(74);
          theTree.insert(79);
          
          //Display output in tree form
          System.out.println("Display output in tree form");
          theTree.displayTree();
 
          // displayTreeSpiral
          System.out.println("\nDisplay tree spiral");
          theTree.displayTreeSpiral();
 
    }
}
 
//output
/*
//Display output in tree form
                                 50                                                             
             17                           72                           
     12           23             54           76           
   9    14   19     24              53  67        75 78   
8 10 13 15 18 20 23 25 52 -- 54 68 74 -- 76 79 
 
Display tree spiral
50 72 17 12 23 54 76 78 75 67 53 24 19 14 9 8 10 13 15 18 20 23 25 52 54 68 74 76 79
*/