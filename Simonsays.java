import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] s = new String[n];
		int idx = -1;

		for (int i = 0; i < n; i++) {
			String tmp = in.nextLine();
			if (tmp.split(" ")[0].equals("Simon") && tmp.split(" ")[1].equals("says"))
			{
				String[] frag = tmp.split(" ");

				tmp = " ";
				for (int j = 2; j < frag.length; j++) {
					tmp += frag[j] + " ";
				}
				s[++idx] = tmp;
			}
		}
		for (int j = 0; j <= idx; j++)
		{
			System.out.println(s[j]);
		}
	}
}
