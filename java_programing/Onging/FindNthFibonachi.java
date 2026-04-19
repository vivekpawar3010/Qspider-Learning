
import java.util.Scanner;

public class FindNthFibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int num = 1; num < 10000; num++) {
            int n = num;
            int n1 = 0, n2 = 1, ans;
            for (int i = 0; i < n - 1; i++) {
                ans = n1 + n2;
                n1 = n2;
                n2 = ans;
            }
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            if (n1 == sum) {
                System.out.println("this is this");
            } else {
                System.out.println(n1 + "  " + sum);
            }

        }
    }
}
