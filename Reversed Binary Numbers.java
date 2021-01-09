import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());

		String bin = Integer.toBinaryString(n);
		String out = "";

		for (int i = bin.length()-1; i >= 0; i--) {
			out+=bin.charAt(i);
		}

		int f = Integer.parseInt(out, 2);
		System.out.println(f);
	}
}
