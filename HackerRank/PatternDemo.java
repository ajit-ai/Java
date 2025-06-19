package HackerRank;


import java.util.Scanner;

public class PatternDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the length of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Count negative subarrays
        int count = countNegativeSubarrays(arr);
        
        // Print the result
        System.out.println(count);
        
        scanner.close();
    }

    private static int countNegativeSubarrays(int[] arr) {
        int n = arr.length;
        int negativeCount = 0;

        // Iterate over all possible subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0; // Reset sum for each starting point
            for (int end = start; end < n; end++) {
                sum += arr[end]; // Calculate sum of the current subarray
                if (sum < 0) {
                    negativeCount++; // Increment count if subarray sum is negative
                }
            }
        }

        return negativeCount;
    }
}
