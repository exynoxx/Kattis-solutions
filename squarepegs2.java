import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class squarepegs2 {
    public static double getRadius(int size) {
        return Math.sqrt(2 * Math.pow(size, 2)) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nmk = in.nextLine().split(" ");
        int n = Integer.parseInt(nmk[0]);
        int m = Integer.parseInt(nmk[1]);
        int k = Integer.parseInt(nmk[2]);

        String[] nline = in.nextLine().split(" ");
        String[] mline = in.nextLine().split(" ");
        String[] kline = in.nextLine().split(" ");

        ArrayList<Double> source = new ArrayList<>(m + k);
        ArrayList<Double> target = new ArrayList<>(n);

        for (int i = 0; i < m; i++) source.add(Double.parseDouble(mline[i]));
        for (int i = 0; i < k; i++) source.add(getRadius(Integer.parseInt(kline[i])));
        for (int i = 0; i < n; i++) target.add(Double.parseDouble(nline[i]));

        Collections.sort(source, Collections.reverseOrder());
        Collections.sort(target, Collections.reverseOrder());
        int sIndex = 0;
        int tIndex = 0;
        int count = 0;
        while (true) {

            if (sIndex >= m + k || tIndex >= n) {
                break;
            }
            if (source.get(sIndex) < target.get(tIndex)) {
                count++;
                sIndex++;
                tIndex++;
            } else {
                //source[sIndex] >= target[tIndex]
                sIndex++;
            }
        }
        System.out.println(count);


    }
}
