import java.util.Scanner;

/**
 * Created by nicholas on 16/10/2017.
 */
public class Patuljci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(in.nextLine());
            sum += a[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j && sum - a[i] - a[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) System.out.println(a[k]);
                    }
                    return;
                }
            }
        }
    }
}
