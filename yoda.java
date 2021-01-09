import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class yoda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] a = in.nextLine().toCharArray();
        char[] b = in.nextLine().toCharArray();
        int aindex = a.length-1;
        int bindex = b.length-1;
        ArrayList<Character> ares = new ArrayList<>();
        ArrayList<Character> bres = new ArrayList<>();

        while (aindex >= 0 || bindex >= 0) {

            char numA = (aindex >= 0) ? a[aindex] : '0';
            char numB = (bindex >= 0) ? b[bindex] : '0';

            if (numA == numB) {
                ares.add(numA);
                bres.add(numB);
            } else if (numA > numB) {
                ares.add(numA);
            } else {
                bres.add(numB);
            }
            aindex--;
            bindex--;
        }

        if(ares.size() == 0) {
            System.out.println("YODA");
        } else {
            char[] finala = new char[ares.size()];
            for (int i = ares.size()-1,j=0; i >= 0; i--,j++) {
                finala[j] = ares.get(i);
            }
            System.out.println(Integer.parseInt(String.valueOf(finala)));
        }

        if (bres.size() == 0) {
            System.out.println("YODA");
        } else {
            char[] finalb = new char[bres.size()];
            for (int i = bres.size()-1, j = 0; i >= 0; i--,j++) {
                finalb[j] = bres.get(i);
            }
            System.out.println(Integer.parseInt(String.valueOf(finalb)));
        }



    }
}
