import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write your code here
        // eg 153
        // total dig = 3
        // 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3
        int n = sc.nextInt();

        int len = 0;
        for (int i = n; i != 0; i /= 10) {
            len++;
        }

        System.out.println("The length of number" + n + " is " + len);

        boolean Armstrong = isArmstrong(n, len);
        if (Armstrong) {
            System.out.println("The given number " + n + " is a Armstrong Number");
        } else
            System.out.println("The given number " + n + " is a Not Armstrong Number");

    }

    public static boolean isArmstrong(int n, int len) {
        int sum = 0;
        for (int i = n; i != 0; i /= 10) {
            sum += MyMath.pow(i % 10, len);
        }
        return sum == n;
    }
}
