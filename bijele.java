import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");

		int king = Integer.parseInt(input[0]);
		int queen = Integer.parseInt(input[1]);
		int rooks = Integer.parseInt(input[2]);
		int bishops = Integer.parseInt(input[3]);
		int knights = Integer.parseInt(input[4]);
		int pawns = Integer.parseInt(input[5]);

		System.out.println(
				(1 - king)+ " " +
				(1 - queen)+ " " +
				(2 - rooks)+ " " +
				(2 - bishops)+ " " +
				(2 - knights)+ " " +
				(8 - pawns)
		);
	}
}
