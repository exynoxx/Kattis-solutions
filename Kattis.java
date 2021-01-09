import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nicholas on 16/10/2017.
 */
public class Kattis {
    Scanner in;

    public Kattis() {
        in = new Scanner(System.in);
    }

    public String getString () {
        return in.nextLine();
    }

    public int getInt () {
        return Integer.parseInt(in.nextLine());
    }

    public int getInt (String n) {
        return Integer.parseInt(n);
    }

    public int[] getIntArray (String token) {
        int[] array = Arrays.stream(in.nextLine().split(token)).mapToInt(Integer::parseInt).toArray();
        return array;
    }
}
