public class Pattern35 {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n / 4) {
                    System.out.print("*  ");
                } else {
                    System.err.print("   ");
                }
            }
            System.out.println();
        }
    }
}
