import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");

		int h = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		if (m < 45) {
			h--;
			if (h < 0) h = 23;
			m = 60 - (45 - m);

		} else{
			m-=45;
		}
		System.out.println(h + " " + m);
	}
}
