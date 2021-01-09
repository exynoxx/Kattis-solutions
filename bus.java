import java.util.Scanner;

/**
 * Created by nicholas on 16/10/2017.
 */
public class bus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = Integer.parseInt(in.nextLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(in.nextLine());
            System.out.println((int)Math.pow(2,k)-1);
        }
    }
}
