import java.util.HashMap;
import java.util.Scanner;

public class noduplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] tokens = in.nextLine().split(" ");
        HashMap<String,Boolean> hm = new HashMap<>();

        for (int i = 0; i < tokens.length; i++) {
            if (hm.containsKey(tokens[i])){
                System.out.println("no");
                return;
            } else {
                hm.put(tokens[i], Boolean.TRUE);
            }
        }
        System.out.println("yes");
    }
}
