import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayOfThaProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

     if (year >= 1919) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return new String(calcLeapYearDate(year));
                    } else {
                        return new String(calcNotLeapYearDate(year));
                    }
                } else {
                    return new String(calcLeapYearDate(year));
                }
            } else {
                return new String(calcNotLeapYearDate(year));
            }
        }
        
        if (year >= 1700 && year < 1918) {
            if (year % 4 == 0) {
                return new String(calcLeapYearDate(year));
            } else {
                return new String(calcNotLeapYearDate(year));
            }
        }
        
        if (year == 1918) {
            return "26.09.1918"; 
        }
        
        return "";
    }

     private static String calcLeapYearDate (int year) {
        StringBuilder sb = new StringBuilder();
        
        int day = 256 - 244;
        sb.append(day);
        sb.append(".");
        sb.append("09.");
        sb.append(year);
        
        return sb.toString();
    }
    
    private static String calcNotLeapYearDate (int year) {
        StringBuilder sb = new StringBuilder();
        
        int day = 256 - 243;
        sb.append(day);
        sb.append(".");
        sb.append("09.");
        sb.append(year);
        
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
