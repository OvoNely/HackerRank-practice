import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int minCount = 0;
        int maxCount = 0;
        int maxValue = scores[0];
        int minValue = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxValue) {
                maxCount++;
                maxValue = scores[i];
            }

            if (scores[i] < minValue) {
                minCount++;
                minValue = scores[i];
            }
        }

        int[] result = {maxCount, minCount};

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
            	System.out.println(" ");
            }
        }
       
        scanner.close();
    }
}
