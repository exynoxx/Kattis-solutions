import java.util.Scanner;

/**
 * Created by nicholas on 31/03/2017.
 */
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = Integer.parseInt(in.nextLine());

		int a = 0;
		int b = 1;
		int newB = 0;
		int newA = 0;




		for (int l = 0; l < k-1; l++) {
			for (int i = 0; i < a; i++) {
				newB++;
			}
			for (int i = 0; i < b; i++) {
				newA++;
				newB++;
			}
			a = newA;
			b = newB;
			newA = newB = 0;
		}

		System.out.println(a + " " + b);
		/*String s = "A";

		for (int i = 0; i < k; i++) {
			String tmp = "";
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == 'A'){
					tmp+="B";
				} else
				{
					tmp+="BA";
				}
			}
			s = tmp;
		}

		int count_A = 0;
		int count_B = 0;

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (c == 'A'){
				count_A+=1;
			} else
			{
				count_B+=1;
			}
		}

		System.out.println(count_A + " " + count_B);*/
	}
}
