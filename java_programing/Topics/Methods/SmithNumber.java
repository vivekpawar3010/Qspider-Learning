public class SmithNumber {
    public static void main(String args[]) {
        int n = 0;

        for (int num = 1; num < 1000; num++) {
            if (isPrime(num))
                continue;
            if (isSmithNumber(num)) {

                System.out.println(++n + "). " + num + " is a Smith number.");

            }
            // else {
            // System.out.println(n + " is not a Smith number.");
            // }
        }
        System.out.println("count of the smith number in the given range;  " + n);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int res = 0;
        for (int i = num; i > 0; i /= 10) {
            res += i % 10;
        }
        return res;
    }

    public static int sumOfPrimeFactors(int num) {
        int res = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                num /= i;
                res += sumOfDigits(i);
            }
            if (num == 1)
                break;
        }

        return res;
    }

    public static boolean isSmithNumber(int n) {
        int sumDigits = sumOfDigits(n);
        int sumPrimeFactors = sumOfPrimeFactors(n);
        return sumDigits == sumPrimeFactors;
    }
}
