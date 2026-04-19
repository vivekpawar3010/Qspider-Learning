public class Assignements {

    public static void main(String[] args) {
        int n = 17;
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j <= n - 1 || i >= j && i + j >= n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 2: Butterfly Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j && i + j <= n - 1 || i <= j && i + j >= n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 3: Half Butterfly Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j && i + j <= n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 4:Half Butterfly Pattern 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j >= n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 5: right tilted Rombus Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - i - 1; j++) {
                if (j < n - i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 5: left tilted Rombus Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 6: Hollow Diamond Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n / 2 || i - j >= n / 2 || i - j <= -n / 2 || i + j >= n + n / 2 - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 6: Upper part Hollow Diamond Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n / 2 || i - j <= -n / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println("Pattern 6: Upper part Hollow Diamond Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n / 2 || i - j >= n / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }

    }
}
// || i + j >= n + n / 2 -