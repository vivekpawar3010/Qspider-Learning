package JoinPremium.Pattern;

public class ConcentricRectangle {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        while (n != 0) {
            n = new java.util.Scanner(System.in).nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(min(i, j, n - i - 1, n - j - 1) + 1 + " ");
                }
                System.out.println();
            }
        }
    }

    public static int min(int a, int b, int c, int d) {
        return ((a < b) ? (a < c ? (a < d ? a : d) : (c < d ? c : d))
                : (b < c ? (b < d ? b : d) : (c < d ? c : d)));
    }
}
