import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> input = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(in.nextLine());
			if (!input.contains((n%42)))
				input.add((n%42));
		}

		System.out.println(input.size());

	}
}
