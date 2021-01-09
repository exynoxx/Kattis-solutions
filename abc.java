/**
 * Created by nicholas on 17/10/2017.
 */
public class abc {
    public static void main(String[] args) {
        Kattis k = new Kattis();

        int[] a = k.getIntArray(" ");
        int[] b = new int[3];
        int min = 101, max = 0, maxIdx = 0, minIdx = 0;
        String s = k.getString();

        for (int i = 0; i < 3; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIdx = i;
            }
        }

        int idx = 0;
        for (char c : s.toCharArray()) {

            if (c == 'B') {
                if (minIdx == maxIdx) b[idx] = a[maxIdx];
                if (minIdx == 1 && maxIdx == 2 || minIdx == 2 && maxIdx == 1) b[idx] = a[0];
                if (minIdx == 0 && maxIdx == 2 || minIdx == 2 && maxIdx == 0) b[idx] = a[1];
                if (minIdx == 0 && maxIdx == 1 || minIdx == 1 && maxIdx == 0) b[idx] = a[2];
            } else if (c == 'A') {
                b[idx] = min;
            } else if (c == 'C') {
                b[idx] = max;
            }
            idx++;
        }

        System.out.println(b[0] + " " + b[1] + " " + b[2]);

    }
}
