import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		if ((n-m) < 0)
		{
			System.out.println("Dr. Chaz will have " + (m-n) + " " + (m-n > 1 ? "pieces" : "piece") + " of chicken left over!");
		} else
		{
			System.out.println("Dr. Chaz needs " + (n-m) + " more " + (n-m > 1 ? "pieces" : "piece") + " of chicken!");
		}
	}
}
