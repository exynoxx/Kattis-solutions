import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by nicholas on 17/10/2017.
 */
public class simplicity {
    public static void main(String[] args) {
        Kattis k = new Kattis();

        int[] map = new int[30];
        String s = k.getString();

        int simplicity = 0;
        for (char c : s.toCharArray()) {

            int index = ((int)c) - 97;

            if (map[index] == 0) {
                simplicity++;
            }

            map[index]++;
        }

        if (simplicity <= 2) {
            System.out.println(0);
        } else {

            Arrays.sort(map);
            int result = 0;
            int iterator = 0;
            for (int i = 0; simplicity-iterator > 2; i++) {
                if (map[i] > 0) {
                    result += map[i];
                    iterator++;

                }
            }
            System.out.println(result);

        }

    }
}
