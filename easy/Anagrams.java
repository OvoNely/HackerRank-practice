import java.util.Scanner;

public class Anagrams {
	
	public static char[] sort(char[] arrA) {
		
		for (int j = 1; j < arrA.length; j++) {
			char key = arrA[j];
			int i = j - 1;
			while (i >= 0 && arrA[i] > key) {
				arrA[i + 1] = arrA[i];
				i -= 1;
			}
			arrA[i + 1] = key;
		}
		
		return arrA;
	}
	
	static boolean isAnagram(String a, String b) {
		
		// covert strings to char arrays
		char[] arrA = a.toLowerCase().toCharArray();
		char [] arrB = b.toLowerCase().toCharArray();
		
		// sorting arrays
		sort(arrA);
		sort(arrB);
		
		// comparing
		if(new String(arrA).compareTo(new String(arrB)) == 0) {
			return true;
		}
		
		return false;
    }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
