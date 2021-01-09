import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        double white = 0;
        double lower = 0;
        double upper = 0;
        double symbol = 0;

        char[] ch = line.toCharArray();
        double n = ch.length;

        for (int i = 0; i < n; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') lower++;
            else if (ch[i] >= 'A' && ch[i] <= 'Z') upper++;
            else if (ch[i] == '_') white++;
            else symbol++;
        }
        System.out.println(white/n);
        System.out.println(lower/n);
        System.out.println(upper/n);
        System.out.println(symbol/n);

    }
}
