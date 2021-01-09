import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nicholas on 29/07/2017.
 */
public class main {

	public static double nthroot(int n, double x)
	{
		return nthroot(n, x, .0001);
	}
	public static double nthroot(int n, double x, double p)
	{
		if(x < 0)
		{
			System.err.println("Negative!");
			return -1;
		}
		if(x == 0)
			return 0;
		double x1 = x;
		double x2 = x / n;
		while (Math.abs(x1 - x2) > p)
		{
			x1 = x2;
			x2 = ((n - 1.0) * x2 + x / Math.pow(x2, n - 1.0)) / n;
		}
		return x2;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {
			String[] input = in.nextLine().split(" ");
			if (input[0].equals("0")){
				break;
			}

			double x1 = Double.parseDouble(input[0]);
			double y1 = Double.parseDouble(input[1]);
			double x2 = Double.parseDouble(input[2]);
			double y2 = Double.parseDouble(input[3]);
			double p = Double.parseDouble(input[4]);

			double result = Math.pow(Math.pow(Math.abs(x1 - x2),p)+Math.pow(Math.abs(y1 - y2),p),1.0/p);
			System.out.println(result);
		}

	}
}
