package basic;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.lang.reflect.Method;

public class PrimeSector {

    public static void main(String[] args) {
          
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
        
    }
}



class Printer
{
   //Write your code here
 public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){        
            System.out.println(element);
         }
    }
}