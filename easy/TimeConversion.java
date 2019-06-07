import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        StringBuffer sb = new StringBuffer();
        boolean pm = false;

        if(s.contains("PM"))
            pm = true;

        String[] time = s.split(":");

        int hours = Integer.parseInt(time[0]);
        if (pm && hours < 12)
            hours += 12;
        else if (!pm && hours == 12)
            hours = 0;

        if (hours < 10) { //hours
            sb.append("0");
            sb.append(hours);
            sb.append(":");
        } else {
            sb.append(hours);
            sb.append(":");
        }
             

        sb.append(time[1]); //minutes

        String[] sec = time[2].split("[A-Z]");

        sb.append(":");
        sb.append(sec[0]);

        return sb.toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
