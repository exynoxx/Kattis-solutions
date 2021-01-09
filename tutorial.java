import java.math.BigInteger;
import java.util.Scanner;

public class tutorial {

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    static int exp (int n) {
        int two = 2;
        int ret = 2;
        for (int i = 0; i < n-1; i++) {
            ret = ret * two;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(" ");
        int m = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        int t = Integer.parseInt(line[2]);

        if (t == 1) {
            if (n > 12) {
                System.out.println("TLE");
            } else {
                if (factorial(n) <= m) {
                    System.out.println("AC");
                } else {
                    System.out.println("TLE");
                }
            }
        }
        if (t == 2) {
            if (n > 32) {
                System.out.println("TLE");
            } else {
                if (exp(n) <= m) {
                    System.out.println("AC");
                } else {
                    System.out.println("TLE");
                }
            }
        }
        if (t == 3) {
            if (n > 256) {
                System.out.println("TLE");
            } else {
                if (Math.pow(n,4) <= m) {
                    System.out.println("AC");
                } else {
                    System.out.println("TLE");
                }
            }
        }
        if (t == 4) {
            if (n > 1625) {
                System.out.println("TLE");
            } else {
                if (Math.pow(n,3) <= m) {
                    System.out.println("AC");
                } else {
                    System.out.println("TLE");
                }
            }
        }
        if (t == 5) {

            if (n > 65536) {
                System.out.println("TLE");
            } else {
                if (Math.pow(n,2) <= m) {
                    System.out.println("AC");
                } else {
                    System.out.println("TLE");
                }
            }
        }
        if (t == 6) {

            double log = Math.log10(n)/Math.log10(2);
            double ceil = Math.ceil(log * n);

            if (ceil <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        }
        if (t == 7) {
            if (n <= m) {
                System.out.println("AC");
            } else {
                System.out.println("TLE");
            }
        }
    }
}
