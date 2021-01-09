import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] input = in.nextLine().split(" ");
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(input[i]) < 0)
				j++;
		}
		System.out.println(j);
	}
}
