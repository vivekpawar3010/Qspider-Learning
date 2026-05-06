package JoinPremium.NumberPrograms.PowerFactorial;
public class ArmstrongNum {
//     Armstrong Number: A number that is equal to the sum of its own digits raised to the power of the number of digits.

// Example: 153 (It has 3 digits. 1³ + 5³ + 3³ = 1 + 125 + 27 = 153)

    public static void main(String[] args) {
       int n = new java.util.Scanner(System.in).nextInt();
       int original = n;
        int sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        while (n != 0) {
            int d = Math.abs(n % 10);
            sum += (int) Math.pow(d, digits);
            n /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        while (n != 0) {
            int d = Math.abs(n % 10);
            sum += (int) Math.pow(d, digits);
            n /= 10;
        }
        return sum == original;
    }
}
