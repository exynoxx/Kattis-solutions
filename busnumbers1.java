import java.util.Arrays;
import java.util.Scanner;

public class busnumbers1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            int endi = i+1;
            int count = 1;

            for (; endi < n; endi++) {
                if (array[endi] == array[endi-1]+1)
                    count++;
                else break;
            }

            if (count > 2) {
                System.out.print(array[i] + "-" + array[endi-1] + " ");
                i = endi-1;
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
