import java.util.HashMap;
import java.util.Scanner;

public class srednij {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        line = in.nextLine().split(" ");

        int[] array = new int[n];
        int[] arr = new int[n];
        int idx = -1;
        int count = 0;


        for (int i = 0; i < n; i++) {
            int e = Integer.parseInt(line[i]);
            if (e > b) array[i] = 1;
            if (e == b) idx = i;
            if (e < b) array[i] = -1;
        }

        if (idx == -1) {
            System.out.println("0");
            return;
        }

        /* create array of bigger, smaller than B
            make culmutative sum each way from index B
            find opposit values of each side of index B
         */

        HashMap<Integer,Integer> hm = new HashMap<>();


        int sum = 0;
        for (int i = idx + 1; i < n; i++) {
            arr[i] = sum = array[i] + sum;
            if (sum == 0) count++;

            Integer amountOfSum = hm.get(arr[i]);
            if (amountOfSum == null) {
                hm.put(arr[i],1);
            } else {
                hm.put(arr[i],amountOfSum+1);
            }

        }
        sum = 0;
        for (int i = idx - 1; i >= 0; i--) {
            arr[i] = sum = array[i] + sum;
            if (sum == 0) count++;

            Integer amountOfSum = hm.get(-arr[i]);
            if (amountOfSum != null) {
                count += amountOfSum;
            }

        }
        System.out.println(count + 1);
    }
}
