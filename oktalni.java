import java.math.BigInteger;
import java.util.Scanner;

public class oktalni {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger t = new BigInteger(in.nextLine(),2);
        System.out.println(t.toString(8));
    }
}
