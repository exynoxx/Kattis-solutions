import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class bst {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long c = 0;

        TreeMap<Integer,Integer> tm = new TreeMap<>();

        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            Integer x = Integer.valueOf(in.readLine());

            Integer a = tm.floorKey(x);
            Integer b = tm.ceilingKey(x);

            int depth = 0;
            if (a == null) {
                if (b == null) {
                    depth = 0;
                } else {
                    depth = tm.get(b) + 1;
                }
            } else {
                if (b == null) {
                    depth = tm.get(a) + 1;
                } else {
                    depth = Math.max(tm.get(a), tm.get(b)) + 1;
                }
            }
            tm.put(x,depth);
            c += depth;
            System.out.println(c);
        }
    }
}
