package JoinPremium.NumberPrograms.FactorMultipels;

// Abundant Number: A number for which the sum of its proper divisors is greater than the number itself.
// Example: 12 -> divisors 1,2,3,4,6 sum=16 > 12
public class AbundantNum {
    public static boolean isAbundant(int n) {
        if (n <= 0)
            return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum > n;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        int sum = 0;
        String factors = "";
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                factors += "+" + i;
            }

        }
        if (sum > n) {
            System.out.println(
                    "The Entered Number is a Abundant Number \n This number haveing following factors \n " + factors
                            + " = " + sum);
        } else {
            System.out.println(
                    "The given number is not a Abandant Number\n This number haveing following factors \n " + factors
                            + " = " + sum);
        }
    }
}
