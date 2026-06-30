import java.util.Scanner;

public class ButterflyPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter_size: ");
        // n = sc.nextInt();
        n = 7;

        // Example_Output
        // *_ _ _ _*
        // **_ _ _**
        // ***_ _***
        // *********
        // ***_ _***
        // **_ _ _**
        // *_ _ _ _*

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i >= j && i + j <= n - 1) || (i <= j && i + j >= n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
