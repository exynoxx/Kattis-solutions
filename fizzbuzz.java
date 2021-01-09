import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");

		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		int n = Integer.parseInt(input[2]);
		boolean a = false;

		for (int i = 1; i <= n; i++) {
			if (i % x == 0) {System.out.print("Fizz"); a = true;}
			if (i % y == 0) {System.out.print("Buzz"); a = true;}

			if (a) {
				System.out.println("");
				a = false;
			}
			else System.out.println(i);


		}

	}
}
