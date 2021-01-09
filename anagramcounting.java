import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class anagrams {

    public static BigInteger factorial (int n) {

        BigInteger val = new BigInteger(String.valueOf(1));
        for (int i = n; i > 1; i--) {
            val = val.multiply(BigInteger.valueOf(i));
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<Character, Integer> hm = null;
        while (in.hasNext()) {
            String s = in.nextLine();
            hm = new HashMap<>();

            for (char c : s.toCharArray()) {
                if (hm.get(c) == null) {
                    hm.put(c,1);
                } else {
                    hm.put(c,hm.get(c)+1);
                }
            }

            int sum = 0;
            BigInteger product = BigInteger.valueOf(1);


            Iterator it = hm.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();

                sum += (int)pair.getValue();
                product = product.multiply(factorial((int) pair.getValue()));
            }

            System.out.println(factorial(sum).divide(product));
        }
    }
}
