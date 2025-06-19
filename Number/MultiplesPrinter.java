package Number;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplesPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        reader.close();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.printf("%d x %d = %d%n", n, i, result);
        }
    }
}