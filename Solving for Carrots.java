import java.util.Scanner;

/**
 * Created by nicholas on 04/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int p = Integer.parseInt(input[1]);

		for (int i = 0; i < n; i++) {
			in.nextLine();
		}
		System.out.println(p);
	}
}
