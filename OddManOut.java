import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		long[] ret = new long[n];
		int idx = -1;

		for (int i = 0; i < n; i++) {
			int G = Integer.parseInt(in.nextLine());
			String[] keys = in.nextLine().split(" ");
			List<Long> l = new ArrayList<>();

			for (String k : keys)
			{
				long kk = Long.parseLong(k);
				if (l.contains(kk))
				{
					l.remove(l.indexOf(kk));
				} else
				{
					l.add(kk);
				}
			}
			ret[++idx] = l.get(0);

		}

		for (int i = 0; i < n; i++) {
			System.out.println("Case #"+(i+1)+": "+ret[i]);
		}

	}
}
