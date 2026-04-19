package java_programing.LoopExamples;

public class TwinPrimeNum {
    public static void main(String[] args) {
        int num1 = new java.util.Scanner(System.in).nextInt();
        int num2 = new java.util.Scanner(System.in).nextInt();

        int diff = num2 - num1;
        if (diff == 2) {
            System.out.println("may be the " + num1 + " and " + num2 + " are twin prime numbers.\n let's check it.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin prime numbers.");
            return;
        }

        boolean num1prime = true;
        for (int i = 2; i <= num1; i++) {

            if (num1 % i == 0) {
                num1prime = false;
                return;
            }
        }
        if (!num1prime) {
            System.err.println(num1 + " is not a prime number.");
            return;
        } else {
            System.out.println(num1 + " is a prime number.");
        }
        boolean num2prime = true;
        for (int i = 2; i <= num2; i++) {

            if (num2 % i == 0) {
                num2prime = false;
                return;
            }
        }
        if (!num2prime) {
            System.err.println(num2 + " is not a prime number.");
            return;
        } else {
            System.out.println(num2 + " is a prime number.");
        }
        if (num1 == num2 - 2) {
            System.out.println(num1 + " and " + num2 + " are twin prime numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin prime numbers.");
        }
    }
}
