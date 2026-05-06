package JoinPremium.NumberPrograms.DigitExtraction;

// Harshad (Niven) Number: A number that is completely divisible by the sum of its digits.

// Example: 18 (Sum is 1+8=9. 18 is divisible by 9)
public class HarshadNum {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        int temp = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (temp % sum == 0) {
            System.out.println("This is a Harshad Number");
        } else {
            System.out.println("This is not a Harshad Number");
        }
    }
    public static boolean isHarshad(int n){
        int sum = 0;
        int temp = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (temp % sum == 0) return true;
        return false;
    }
}
