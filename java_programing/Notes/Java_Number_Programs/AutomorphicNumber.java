import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write your code here
        int n = sc.nextInt();

        boolean AutoMorphic = isAutomorphic(n);
        if (AutoMorphic) {
            System.out.println("the given number " + n + " is a Automorphic number");
        } else {
            System.out.println("the given number " + n + " is a Not a Automorphic number");
        }

    }

    public static boolean isAutomorphic(int n) {
        int len = MyMath.lenNum(n);
        int pow = MyMath.tenpow(len);
        int sq = n * n;
        int lastprt = sq % pow;
        return n == lastprt;
    }
}
