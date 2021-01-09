import java.math.BigInteger;
import java.util.Scanner;

public class anothercandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = Integer.parseInt(in.nextLine());

        for (int i = 0; i < t; i++) {
            in.nextLine();
            long n = Long.parseLong(in.nextLine());
            BigInteger sum = BigInteger.valueOf(0);

            for (int j = 0; j < n; j++) {
                long x = Long.parseLong(in.nextLine());
                BigInteger xx = BigInteger.valueOf(x);
                sum = sum.add(xx);
            }

            if (Long.parseLong(sum.mod(BigInteger.valueOf(n)).toString()) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
