package basic;

public class SingeDimension {
    public static void main(String[] args) {
        
        // Declare and initialize a single-dimensional array of integers
        int[] singleDimensionalArray = {1, 2, 3, 4, 5};

        // Print the elements of the array using a for loop
        System.out.println("Elements of the single-dimensional array:");
        for (int i = 0; i < singleDimensionalArray.length; i++) {
            System.out.println("Element at index " + i + ": " + singleDimensionalArray[i]);
        }

        // Print the elements of the array using an enhanced for loop
        System.out.println("Elements of the single-dimensional array using enhanced for loop:");
        for (int value : singleDimensionalArray) {
            System.out.println(value);
        }
    }
}
