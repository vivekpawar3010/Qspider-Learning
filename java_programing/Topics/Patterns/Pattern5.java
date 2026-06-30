
public class Pattern5 {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < n - i - 1) {
                    System.out.print("   ");
                } else {
                    System.err.print("*  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - i; j++) {
                if (j > i) {
                    System.out.print("*  ");
                } else {
                    System.err.print("   ");
                }
            }
            System.out.println();
        }
    }
}
