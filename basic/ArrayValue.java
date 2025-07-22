package basic;

public class ArrayValue {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] intArray = {10, 20, 30, 40, 50};

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


/**
Array Properties
In Java, all arrays are dynamically allocated.
Arrays may be stored in contiguous memory [consecutive memory locations].
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using size of.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning with 0.
Java array can also be used as a static field, a local variable, or a method parameter.
**/