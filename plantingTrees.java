import java.util.Arrays;

/**
 * Created by nicholas on 16/10/2017.
 */
public class plantingTrees {
    public static void main(String[] args) {
        Kattis k = new Kattis();

        int seeds = k.getInt();
        int[] a = k.getIntArray(" ");

        Arrays.sort(a);
        for( int i = 0; i < a.length/2; ++i )
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        int max = 0;
        for (int i = 1; i <= a.length; i++) {
            max = Math.max(max, i+a[i-1]+1);
        }

        System.out.println(max);
    }
}
