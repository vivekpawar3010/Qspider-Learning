import java.util.Scanner;

public class FibonachiCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n1 = 0, n2 = 1, ans;
        int count = 0;
        while (true) {
            ans = n1 + n2;
            if (ans > end) {
                break;
            }
            if (ans >= start) {
                count++;
            }
            n1 = n2;
            n2 = ans;
        }
        System.out.println("There are " + count + " Fibonacci numbers in the given range.");
    }
}
