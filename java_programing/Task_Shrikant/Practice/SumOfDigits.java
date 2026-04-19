package program11;

// import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] main) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        int num = 1234;
        int dup = num;

        int sum = 0;
        int rem = 0;

        rem = num % 10;
        sum += rem;
        num /= 10;

        rem = num % 10;
        sum += rem;
        num /= 10;

        rem = num % 10;
        sum += rem;
        num /= 10;

        rem = num % 10;
        sum += rem;
        num /= 10;
        // without using the loop

        // by using the loop
        // while (num > 0 && num < 1000) {
        // int rem = num % 10;
        // sum += rem;
        // num = num / 10;
        // }

        System.out.println("The sum of the Digit" + dup + " is " + sum);
    }
}