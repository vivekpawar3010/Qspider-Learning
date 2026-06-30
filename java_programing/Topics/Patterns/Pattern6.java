public class Pattern6 {
    public static void main(String[] args) {
        int n = 17;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {

                if (j >= n - i + 1 && j <= n + i - 1 && (j - n + i) % 2 == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
