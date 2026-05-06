package JoinPremium.NumberPrograms.DigitExtraction;

// Magic Number: Repeatedly sum the digits of the number until a single digit is obtained; if that digit is 1, the
// number is a magic number.
// Example: 145 -> 1+4+5 = 10 -> 1+0 = 1 (magic)
public class MagicNum {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        while (n > 9) {
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
            sum = 0;
        }

        if (n == 1) {
            System.out.println("This is a magic number");
        } else {
            System.out.println("Entered number is not a Magic Number");
        }
    }

    public static boolean isMagic(int n) {
        int sum = 0;
        while (n > 9) {
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
            sum = 0;
        }

        return n == 1;
    }
}
