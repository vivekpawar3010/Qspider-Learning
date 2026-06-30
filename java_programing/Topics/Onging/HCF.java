public class HCF {

    public static int hcf(int a, int b) {

        int small = Math.min(a, b);
        int hcf = 1;

        for (int i = 1; i * i <= small; i++) {

            if (small % i == 0) {

                int f1 = i;
                int f2 = small / i;

                if (a % f2 == 0 && b % f2 == 0)
                    return f2;

                if (a % f1 == 0 && b % f1 == 0)
                    hcf = f1;
            }
        }

        return hcf;
    }

    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j < 10000; j++) {
                if (hcf(i, j) == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}