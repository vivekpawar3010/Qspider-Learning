package JoinPremium.NumberPrograms.PowerFactorial;
// Krishnamurthy (Peterson or Strong) Number: A number whose sum of the factorials of its digits equals the original number.

// Example: 145 (1! + 4! + 5! = 1 + 24 + 120 = 145)

public class Strong {

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int original = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            int fact = 1;
            for (int i = 2; i <= d; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is not a Strong number.");
        }
    }

    public static int fact(int d) {
        int f = 1;
        for (int i = 2; i <= d; i++)
            f *= i;
        return f;
    }

    public static boolean isKrishnamurthy(int n) {
        int original = n;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += fact(d);
            n /= 10;
        }
        return sum == original;
    }

}
