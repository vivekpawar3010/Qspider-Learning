public class Pattern3 {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n / 2 || i - j == n / 2 ||
                        i + j == n + n / 2 - 1 || j - i == n / 2 ||
                        i == n / 4 && j > n / 4 && j < 3 * n / 4 ||
                        j == n / 4 && i > n / 4 && i < 3 * n / 4 ||
                        i == 3 * n / 4 && j > n / 4 && j < 3 * n / 4 ||
                        j == 3 * n / 4 && i > n / 4 && i < 3 * n / 4) {
                    System.err.print("*  ");
                } else {
                    System.err.print("   ");
                }
            }
            System.err.println();
        }
    }
}
/*
 *
 * *
 * *
 * *
 * * * * * * * * *
 * * * *
 * * * *
 * * * *
 * * * *
 * * * *
 * * * *
 * * * *
 * * * * * * * * *
 * *
 * *
 * *
 *
 */