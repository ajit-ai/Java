import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MattherDemo {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              
          Pattern pattern = Pattern.compile("<([^>]+)>([^<]*)</\\1>");
          Matcher matcher = pattern.matcher(line);

          boolean found = false;
          while (matcher.find()) {
            //String tag = matcher.group(1);
            String content = matcher.group(2);

            // Check if content contains any tags
            if (!content.contains("<>")) {
                System.out.println(content);
                found = true;
                 
            }
            //System.out.println(tag);
        }

        if (!found) {
            System.out.println("None");
        }
    
			
			testCases--;
		}
        in.close();
	}
}



