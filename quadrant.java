/**
 * Created by nicholas on 19/10/2017.
 */
public class quadrant {
    public static void main(String[] args) {
        Kattis k = new Kattis();
        int x = k.getInt();
        int y = k.getInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }


    }
}
