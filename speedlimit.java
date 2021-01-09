import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		int n = Integer.parseInt(in.nextLine());
		int prev = 0;

		while (n != -1){
			int sum = 0;
			for (int i = 0; i < n; i++) {
				String[] tmp = in.nextLine().split(" ");
				sum += Integer.parseInt(tmp[0])*(Integer.parseInt(tmp[1])-prev);
				prev = Integer.parseInt(tmp[1]);
			}
			l.add(sum);
			sum = 0;
			prev = 0;
			n = Integer.parseInt(in.nextLine());
		}

		for (int i : l)
		{
			System.out.println(i + " miles");
		}

	}
}
