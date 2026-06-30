import java.util.Scanner;

public class CharacterPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter_size: ");
        n = sc.nextInt();

        // Example_Output
        // ___A
        // __ABA
        // _ABCBA
        // ABCDCBA

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n + i + 1; j++) {
                if (j > n - i - 1) {
                    System.out.print(ch + " ");
                    if (j > n - 1) {
                        ch--;
                    } else {
                        ch++;
                    }
                } else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
