import java.util.Scanner;

public class flyingsafely {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = Integer.parseInt(in.nextLine());
        for (int i = 0; i < cases; i++) {
            String[] line = in.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            for (int j = 0; j < m; j++) {
                in.nextLine();
            }
            System.out.println(n-1);
        }
    }
}
