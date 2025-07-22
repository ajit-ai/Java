package basic;

public class Decleration {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] intArray = new int[5];
        

        // Alternatively, you can declare and initialize the array in one line
        // int[] intArray = {0, 1, 2, 3, 4};
        // or
        // int[] intArray = new int[]{0, 1, 2, 3, 4};
        // or
        // int[] intArray = new int[5]; // This creates an array of size 5 with default values (0 for int)
        // Note: In Java, arrays are zero-indexed, so the first element is at index 0 and the last element is at index length-1.
        // The above declaration creates an array of integers with a size of 5.
        // You can also declare an array of a different type, such as double or String
        // For example:
        // double[] doubleArray = new double[5];
        // String[] stringArray = new String[5]; // This creates an array of Strings with a size of 5, initialized to null
        // You can also declare a multidimensional array



        // Initialize the array with values
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10; // Assigning multiples of 10
        }
        
        // Print the array elements
        for (int value : intArray) {
            System.out.println(value);
        }
    }
}
