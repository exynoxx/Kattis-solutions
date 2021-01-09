/**
 * Created by nicholas on 19/10/2017.
 */
public class sok {
    public static void main(String[] args) {
        Kattis kattis = new Kattis();

        double[] abc = kattis.getDoubleArray(" ");
        double[] ijk = kattis.getDoubleArray(" ");

        double min = Double.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            if (abc[i]/ijk[i] < min) {
                min = abc[i]/ijk[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            double v = abc[i] - (ijk[i] * min);
            System.out.print(v + " ");
        }


    }
}
