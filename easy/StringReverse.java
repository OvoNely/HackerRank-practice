import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder();

        for (int i = A.length(); i > 0; i-- ) {
            sb.append(A.charAt(i - 1));
        }

        if(A.compareTo(sb.toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}

}
