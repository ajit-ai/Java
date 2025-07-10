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
    }
}
