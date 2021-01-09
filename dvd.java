import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nicholas on 01/04/2017.
 */
public class main {

	public static int recursiveFint (int[] A, int key, int idx)
	{
		int ret = key;
		for (int i = idx; i < A.length; i++) {
			if (A[i] == ret) {
				ret = recursiveFint(A, key + 1, i + 1);
				return ret;
			}
		}
		return ret - 1;
	}

	public static int pushPop (int[] A)
	{
		int n = recursiveFint(A, 1, 0);
		return A.length - n;



		/*

		int tmp;
		int count = 0;
		int i = 0;

		while (i < A.length - 1)
		{
			if (A[i] > A[i+1])
			{
				tmp = A[i];

				//move all
				for (int j = i; j < A.length - 1; j++) {
					A[j] = A[j+1];
				}
				A[A.length-1] = tmp;
				count++;
			} else {
				i++;
			}
		}
		return count;
		*/

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = Integer.parseInt(in.nextLine());
		int[] result = new int[k];
		int idx = -1;

		for (int i = 0; i < k; i++) {

			int size = Integer.parseInt(in.nextLine());

			String[] keys = in.nextLine().split(" ");
			int[] keysInt = new int[size];
			for (int j = 0; j < size; j++) keysInt[j] = Integer.parseInt(keys[j]);

			result[++idx] = pushPop(keysInt);
		}

		for (int h : result)
			System.out.println(h);
	}
}
