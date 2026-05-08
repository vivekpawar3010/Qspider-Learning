
package JoinPremium.Pattern.Number;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            
            int value = 1; // First element of every row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                // Iterative formula to find the next element in the row
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
