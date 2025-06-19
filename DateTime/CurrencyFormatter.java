package DateTime;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment).replace("Rs.", "Rs"));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}
