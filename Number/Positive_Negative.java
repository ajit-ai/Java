package Number;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        n=s.nextInt();
        if (n>0) {
            System.out.println("Given number "+n+"is positive");
        }
        else if (n<0) {
            System.out.println("The given number "+n+" is negative");
        }
        else 
        {
            System.out.println("The given number "+n+" is neither positive or negative");
        }

    }
    
}
