import java.util.Scanner;

public class FibonachiInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n1 = 0, n2 = 1, ans;
        System.out.print("Fibonacci numbers in the given range are: ");
        while (true) {
            ans = n1 + n2;
            if (ans > end) {
                break;
            }
            if (ans >= start && ans <= end) {
                System.out.print(ans + " ");
            }
            n1 = n2;
            n2 = ans;
        }

    }
}
