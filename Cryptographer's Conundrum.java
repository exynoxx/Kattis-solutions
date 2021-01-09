import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		s = s.toLowerCase();

		int count = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i+=3) {
			if (c[i] != 'p') count++;
			if (c[i+1] != 'e') count++;
			if (c[i+2] != 'r') count++;
		}
		System.out.println(count);

	}
}
