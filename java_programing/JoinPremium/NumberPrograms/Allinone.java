package JoinPremium.NumberPrograms;

public class Allinone {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("---------------------------------");
        FibboPattern(n);
        String s = "";
        for (int i = 0; i < 100; i++) {
            if (isPrime(i))
                s += (i + " - ");
            else
                System.out.println(i + " is not a prime");
        }
        System.out.println(s);
    }

    public static void FibboPattern(int n) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n1 + " ");
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println();

        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        int den = 2;
        while (den < n / 2) {
            if (n % den == 0)
                return false;
            den++;
        }
        return true;
    }

}
