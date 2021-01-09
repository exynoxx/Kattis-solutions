import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());

		if (n % 2 == 0)
		{
			System.out.println("Bob");
		} else
		{
			System.out.println("Alice");
		}
	}
}
