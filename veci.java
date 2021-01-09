import java.util.Scanner;

/**
 * Created by nicholas on 30/03/2017.
 */
public class main {

	public static int[] insertionSort(int input[], int stop) {

		int temp;
		for (int i = 1; i <= stop; i++) {
			for(int j = i ; j > 0 ; j--){
				if(input[j] > input[j-1]){
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		return input;
	}

	public static int[] swap(int[] num, int i, int j)
	{
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
		return num;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = Integer.parseInt(s.nextLine());
		int len = String.valueOf(n).length();
		int[] digit = new int[len];
		int idx = -1;

		while (n > 0) {
			digit[++idx] = (n % 10);
			n /= 10;
		}

		for (int i = 1; i < digit.length; i++) {
			if (digit[i] < digit[i-1])
			{
				//now swap with the smallest to the right
				int index = i-1;
				int val = digit[index];
				for (int j = i-2; j >= 0; j--) {
					if (digit[j] < val && digit[j] > digit[i])
					{
						val = digit[j];
						index = j;
					}
				}
				swap(digit,i,index);
				digit = insertionSort(digit,i-1);
				for (int k = len-1; k >= 0; k--)
					System.out.print(digit[k]);
				System.out.println("");
				return;
			}
		}
		System.out.println("0");
		return;


	}
}