package basic.Number;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {

        int m,n, sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        m = s.nextInt();
        while (m>0) {
            n = m%10;
            sum = sum * 10 + n;
            m = m/10; //m divided by 10 to make it iterate 10 times

        }
        System.out.println("Reverse a number is " + sum);
            
    }
}

