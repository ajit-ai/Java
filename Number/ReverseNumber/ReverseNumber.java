package Number.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        
        int m,n, reversed = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        m = s.nextInt();
        for(;m!=0;m /= 10) {
            n = m % 10;
            reversed = reversed*10 + n;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
