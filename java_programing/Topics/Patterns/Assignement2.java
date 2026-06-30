    public class Assignement2 {
        public static void main(String[] args) {
            int n = 4;

            System.out.println("Pattern 1");
            int num = 1;
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }

            System.out.println(" Pattern 2");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.println(" Pattern 3");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.println(" Pattern 4");
            num = 1;
            char ch = 'A';
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i % 2 == 0) {
                        System.out.print(ch + " ");
                        ch++;
                    } else {
                        System.out.print(num + " ");
                        num++;
                    }
                }
                System.out.println();
            }

            System.out.println("Pattern: 5");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || i + j == n + 1) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            System.out.println("pattern 6");
            for (int i = 1; i <= n; i++) {
                int num3 = i;
                for (int j = 1; j <= n; j++) {
                    System.out.print(num3 + " ");
                    num3 += n;
                }
                System.out.println();
            }

        }
    }
