import java.util.Scanner;
import java.util.TreeSet;

public class candydivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = Long.parseLong(in.nextLine());
        TreeSet<Long> set = new TreeSet<>();

        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            set.add((long) sqrt);
        }

        for (long i = 1; i < sqrt; i++) {

            if (n % i == 0) {
                set.add(i);
                set.add(n/i);
            }
        }

        for (Long e : set) {
            System.out.print((e-1) + " ");
        }
    }
}