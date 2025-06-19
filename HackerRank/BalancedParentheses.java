package HackerRank;


import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(isBalanced(input));
        }
        
        scanner.close();
    }
    
    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!matches(top, c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
