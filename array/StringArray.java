package array;

public class StringArray {
    public static void main(String[] args) {

        String[] str = new String[3]; // Declares an array 'names' to hold 3 String elements
        str[0] = "Ajit";
        str[1] = "Kumar";
        str[2] = "India";

        // Print the array elements using a for loop
        System.out.println("Array elements using for loop:");

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        // Print the array elements using an enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (String value : str) {
            System.out.println(value);
        }

        // Alternative way to declare and initialize an array
        String[] names = { "Ajit", "Kumar", "India" };

        // Print the array elements using a for loop
        System.out.println("Array elements using for loop with alternative declaration:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Print the array elements using an enhanced for loop with alternative
        // declaration
        System.out.println("Array elements using enhanced for loop with alternative declaration:");

        for (String value : names) {
            System.out.println(value);
        }

        // dDeclaring an array with alternative syntax
        String[] names2 = new String[] { "Ajit", "Kumar", "India" };
        // Print the array elements using a for loop with alternative declaration
        System.out.println("Array elements using for loop with alternative declaration:");
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
    }
}
