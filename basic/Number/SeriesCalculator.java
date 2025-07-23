package basic.Number;

import java.util.Scanner;
public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            printSeries(a, b, n);
        }

        scanner.close();
    }

    public static void printSeries(int a, int b, int n) {
        int result = a;

        for (int j = 0; j < n; j++) {
            result += Math.pow(2, j) * b;
            System.out.print(result + " ");
        }

        System.out.println();
    }
    
}
