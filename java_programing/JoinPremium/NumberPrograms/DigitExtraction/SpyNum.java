package JoinPremium.NumberPrograms.DigitExtraction;

// Spy Number: A number where the sum of its digits equals the product of its digits.
// Example: 1124 (Sum: 1+1+2+4 = 8 | Product: 112*4 = 8)
public class SpyNum {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        if (sum == product) {
            System.out.println("The given number is the Spy number");
        } else {
            System.out.println("The given number is not a Spy number");
        }
    }

    public static boolean isSpyNum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        if (sum == product)
            return true;
        return false;
    }
}