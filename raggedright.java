import java.util.ArrayList;
import java.util.Scanner;

public class raggedright {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (in.hasNext()){
            String line = in.nextLine();
            list.add(line.length());
        }

        int n = 0;
        for (int i : list) {
            n = Math.max(n,i);
        }

        int sum = 0;
        for (int i = 0; i < list.size()-1; i++) {
            int m = list.get(i);
            sum += Math.pow(n-m,2);
        }
        System.out.println(sum);
    }
}
