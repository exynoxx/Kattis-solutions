import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double c = Double.parseDouble(in.nextLine());
		int l = Integer.parseInt(in.nextLine());

		double sum = 0;
		for (int i = 0; i < l; i++) {
			String[] input = in.nextLine().split(" ");
			double a = Double.parseDouble(input[0]);
			double b = Double.parseDouble(input[1]);
			sum += a*b;
		}
		sum *= c;
		System.out.println(sum);
	}
}
