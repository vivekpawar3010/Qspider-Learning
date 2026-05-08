package JoinPremium.Pattern;

public class KshpaedPattern {

    public static void main(String[] args) {
        int n = 11;

        // UpperKertain(n);
        // if(n == 11) return;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 > n / 2 && (j - 1 < i - n / 2 || j < i)) { // TODO:Implement
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void KShape(int n) {
        int star = n / 2 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if (i < n / 2)
                star--;
            else
                star++;
            System.out.println();
        }
    }

    public static void RevKshape(int n) {
        int space = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < space) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            if (i < n / 2)
                space++;
            else
                space--;
            System.out.println();
        }
    }

    public static void UpperKertain(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= (n / 2 - i) || j >= (n / 2 + i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

}