import java.util.Scanner;

public class SnakePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter_size: ");
        n = sc.nextInt();

        // Example_Output
        // 1_2_3_4
        // 8_7_6_5
        // 9_10_11_12

        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + "  ");
                if (i % 2 == 0)
                    num++;
                else
                    num--;
            }
            num += n;
            if (i % 2 == 0)
                num--;
            else
                num++;
            System.out.println();
        }

    }
}
