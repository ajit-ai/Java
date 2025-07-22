package Algorithms.fibonacci;

public class Fibonnacci {
    public static void main(String[] args) {
        //fibonnaci serise
        int n = 10; // Example input for Fibonacci series length
        int[] fibSeries = new int[n];
        fibSeries[0] = 0; // First Fibonacci number
        if (n > 1) {
            fibSeries[1] = 1; // Second Fibonacci number
        }
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2]; // Calculate the next Fibonacci number
        }
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibSeries[i] + " "); // Print the Fibonacci series
        }
    }
}
