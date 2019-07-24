import java.util.*;

public class ParenthesesSequences {

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            int counterBraket = 0;
            int counterBrace = 0;
            int counterSquare = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(') {
                    counterBraket++;
                    continue;
                } else if (input.charAt(i) == '{') {
                    counterBrace++;
                    continue;
                } else if (input.charAt(i) == '[') {
                    counterSquare++;
                    continue;
                } else if (input.charAt(i) == ')') {
                    counterBraket -= 1;
                    if (counterBraket < 0) {
                        break;
                    }
                    continue;
                } else if (input.charAt(i) == '}') {
                    counterBrace -= 1;
                    if (counterBrace < 0) {
                        break;
                    }
                    continue;
                } else if (input.charAt(i) == ']') {
                    counterSquare -= 1;
                    if (counterSquare < 0) {
                        break;
                    }
                    continue;
                }
                
            }
            if (counterBraket == 0 && counterBrace == 0 && counterSquare == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
		}
		sc.close();
		
	}
}
