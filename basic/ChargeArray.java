package basic;

public class ChargeArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] intArray = {1, 2, 3, 4, 5};

        // Print the array elements using a for loop
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Print the array elements using an enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int value : intArray) {
            System.out.println(value);
        }
    
    }
}
