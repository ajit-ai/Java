package basic;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MattherDone {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              
          String regex = "<([^>]+)>([^<]*)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        boolean found = false;
        while (matcher.find()) {
            if (!matcher.group(2).isEmpty()) {
                System.out.println(matcher.group(2));
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
			
			testCases--;
		}
        in.close();
	}
}



