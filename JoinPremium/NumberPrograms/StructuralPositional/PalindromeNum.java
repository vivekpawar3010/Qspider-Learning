package JoinPremium.NumberPrograms.StructuralPositional;

// Palindrome Number: A number that reads the same forwards and backwards.
// Example: 121, 4554
public class PalindromeNum {
    public static boolean isPalindrome(int n) {
        int rev = reversInt(n);
        return rev == n;
    }

    public static int reversInt(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int rev = 0;
        int original = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (rev == original) {
            System.out.println("The given number is a Palidrome Number");
        } else {
            System.out.println("The given number is not a Palidrome Number");
        }
        
    }

}
