import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] arg = in.nextLine().split(" ");
		int r1 = Integer.parseInt(arg[0]);
		int s = Integer.parseInt(arg[1]);

		System.out.println(2*s-r1);
	}
}
