package basic;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class PrimeNumberFact {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
           bufferedReader.close();
        //String  = bufferedReader.readLine();
            BigInteger number = new BigInteger(n);
            
            // Check if the number is prime
            if (number.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
    }

     
    }
