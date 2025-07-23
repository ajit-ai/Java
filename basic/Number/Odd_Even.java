package basic.Number;

import java.util.Scanner;

public class Odd_Even {
    
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
       // n = s.nextInt();
       n = 0;
        if (n%2 == 0) {
            System.out.println("The given number "+n+" is even");
        }
        else {
            System.out.println("The given number "+n+" is Odd");
        }
            
        }
}
