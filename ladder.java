import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		int h = Integer.parseInt(input[0]);
		int v = Integer.parseInt(input[1]);

		int ret = (int) Math.ceil(h/Math.sin(Math.toRadians(v)));
		System.out.println(ret);

	}
}
