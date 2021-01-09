import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.nextLine());
		int n = Integer.parseInt(in.nextLine());

		int leftOver = 0;
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(in.nextLine());
			leftOver = (x+leftOver)-k;
		}
		System.out.println(leftOver+x);
	}
}
