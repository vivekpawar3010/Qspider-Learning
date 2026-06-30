package TestChking;

public class Pattern1 {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int pt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pt--);
            }
            System.out.println();
            pt = pt + 1 + (2 * i);
        }
    }
}