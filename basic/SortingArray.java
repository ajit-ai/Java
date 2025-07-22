package basic;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        
        String[] str = new String[5]; // Declares an array 'names' to hold 3 String elements}
        str[0] = "Rajasthan";
        str[1] = "Karnatka";
        str[2] = "Punjab";
        str[3] = "Gujrat";
        str[4] = "Maharashtra";


        Arrays.sort(str); // Sorts the array in ascending order

        // Print the sorted array elements using a for loop
        System.out.println("Sorted array elements using for loop:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
    }
}
