package DateTime;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class TimeFinder {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();
        
        System.out.println(findDay(month, day, year));
    }
}
