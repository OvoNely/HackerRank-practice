import java.io.*;
import java.util.*;

public class StringTokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String[] stringArray = s.split("\\s*(\\s|,|!|\\?|\\.|_|'|@)\\s*");
        
        System.out.println(stringArray.length);
        
        for (String string : stringArray) {
			System.out.println(string);
		}
	}
}
