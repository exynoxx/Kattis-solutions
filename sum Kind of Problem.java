import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] A = new String[n];
		int index = -1;

		for (int i = 0; i < n; i++) {
			String[] input = in.nextLine().split(" ");
			int idx = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			A[++index] = idx + " " + (k*(k+1)/2)  + " " +  k*k  + " " + k*(k+1);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
	}
}
