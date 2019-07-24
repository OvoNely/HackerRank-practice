import java.util.*;
import java.io.*;

class Map{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<>();

		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();

            phoneBook.put(name, phone);

			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            int ph = 0;
            try {
                ph = phoneBook.get(s);
            } catch (Exception e) {
                System.out.println("Not found");
                continue;
            }

            System.out.println(s + "=" + ph);
		}
	}
}
