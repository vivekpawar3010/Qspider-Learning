import java.util.Scanner;

public class BinaryTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter_size: ");
        n = sc.nextInt();

        // Example_Output
        // 1
        // 01
        // 101
        // 0101

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j + 1) % 2);
            }
            System.out.println();
        }

    }
}
