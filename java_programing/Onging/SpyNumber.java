public class SpyNumber {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        if (sum == product) {
            System.out.println(num + " is a spy number.");
        } else {
            System.out.println(num + " is not a spy number.");
        }
    }
}
