package JoinPremium.NumberPrograms.PowerFactorial;
// Happy Number: A number where if you repeatedly replace it with the sum of the squares of its digits, it eventually equals 1. If it loops endlessly without reaching 1, it is an "Unhappy" number.

// Example: 19 (1² + 9² = 82 -> 8² + 2² = 68 -> 6² + 8² = 100 -> 1² + 0² + 0² = 1)

public class HappyNum {
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int d = Math.abs(n % 10);
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        while (n != 1 && n != 4) {
            int sumSq = 0;
            while (n != 0) {
                int d = n % 10;
                sumSq += d * d;
                n /= 10;
            }
            n = sumSq;
        }
        if (n == 1) {
            System.out.println("Happy number.");
        } else {
            System.out.println("Not a happy number.");
        }
    }

    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = sumOfSquares(n);
        }
        return n == 1;
    }
}
