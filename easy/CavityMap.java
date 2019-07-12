import java.io.*;
import java.util.*;

public class CavityMap {
	 static String[] cavityMap(String[] grid) {

	        int n = grid.length;

	        int[][] arr = new int[n][n];
	    
	        for (int i = 0; i < n; i++) {
	            char[] a = grid[i].toCharArray();
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = Integer.parseInt(Character.toString(a[j]));
	            }
	        }

	        String[] result = new String[n];
	        for (int i = 0; i < n; i++) {
	            StringBuffer sb = new StringBuffer();
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
	                    sb.append(arr[i][j]);
	                } else {
	                    if (arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] &&
	                        arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]) {
	                            sb.append("X");
	                    } else {
	                        sb.append(arr[i][j]);
	                    }
	                }

	            }
	            result[i] = sb.toString();
	        }


	        return result;

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String[] grid = new String[n];

	        for (int i = 0; i < n; i++) {
	            String gridItem = scanner.nextLine();
	            grid[i] = gridItem;
	        }

	        String[] result = cavityMap(grid);

	        for (int i = 0; i < result.length; i++) {
	            bufferedWriter.write(result[i]);

	            if (i != result.length - 1) {
	                bufferedWriter.write("\n");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
}
