import java.io.*;
import java.util.*;

public class StringTokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        	String s = scan.nextLine();
        	scan.close();
        
        	s = s.trim();
        
        	if (s.equals("")) {
          	  System.out.println("0");
           	 return;
       		 }
        
        	String[] stringArray = s.split("[^a-zA-Z]+");
        
        	System.out.println(stringArray.length);
        
        	for (String string : stringArray) {
            		System.out.println(string);
        	}
        
	}
}
