import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cargame {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] nmarray = in.readLine().split(" ");
		int n = Integer.parseInt(nmarray[0]);
		int m = Integer.parseInt(nmarray[1]);

		String[] dict = new String[n];

		for (int i = 0; i < n; i++) {
			dict[i] = in.readLine();
		}
		for (int j = 0; j < m; j++) {
			String plate = in.readLine().toLowerCase();
			String ret = "No valid word";
			for (int i = 0; i < n; i++) {
				String lookupWord = dict[i];
				int idx1 = lookupWord.indexOf(plate.charAt(0));
				if (idx1 < 0) continue;
				int idx2 = lookupWord.indexOf(plate.charAt(1), idx1 + 1);
				if (idx2 < 0) continue;
				int idx3 = lookupWord.indexOf(plate.charAt(2), idx2 + 1);
				if (idx3 < 0) continue;
				ret = lookupWord;
				break;
			}
			System.out.println(ret);
		}
	}
}
