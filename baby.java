import java.util.Scanner;

public class baby {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String line = in.nextLine();
        String[] tokens = line.split(" ");

        for (int i = 0; i < n; i++) {
            if (!tokens[i].equals("mumble")) {
                if (Integer.parseInt(tokens[i]) != i+1) {
                    System.out.println("something is fishy");
                    return;
                }
            }
        }
        System.out.println("makes sense");
    }
}
