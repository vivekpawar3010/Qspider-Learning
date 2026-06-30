import java.util.Scanner;

public class DynamicHeart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size (e.g., 5): ");
        int n = scanner.nextInt();
        scanner.close();

        // Loop through the height and width dynamically
        for (int i = -n; i < n; i++) {
            for (int j = -2 * n; j <= 2 * n; j++) {
                // Calculate the heart shape using the standard algebraic equation
                double equation = Math.pow(Math.pow(j / (double) n, 2) + Math.pow(i / (double) n, 2) - 1, 3) 
                                  - (Math.pow(j / (double) n, 2) * Math.pow(i / (double) n, 3));

                if (equation <= 0.0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
