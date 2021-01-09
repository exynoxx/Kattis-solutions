import java.util.Scanner;

public class busnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int hm[] = new int[M+1];

        int best = 0;

        for (int m = M; m >= 1; m--) {
            for (int i = 1; i < Math.cbrt(m); i++) {
                double cbrt = Math.cbrt(m - i * i * i);
                if ((cbrt % 1) == 0) {
                    hm[m]++;
                }
            }
            if (hm[m] >= 4) {
                System.out.println(m);
                return;
            }
        }
        System.out.println("None");
    }
}
