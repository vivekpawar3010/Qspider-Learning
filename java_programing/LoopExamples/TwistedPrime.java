package java_programing.LoopExamples;

public class TwistedPrime {

    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        boolean numprime = true;
        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                numprime = false;
                return;
            }
        }
        if (!numprime) {
            System.err.println(num + " is not a prime number.");
            return;
        } else {
            System.out.println(num + " is a prime number.");
        }
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        boolean revprime = true;
        for (int i = 2; i <= rev; i++) {

            if (rev % i == 0) {
                revprime = false;
                return;
            }
        }
        if (!revprime) {
            System.err.println(rev + " is not a prime number.");
            return;
        } else {
            System.out.println(rev + " is a prime number.");
        }
        if (num == rev) {
            System.out.println(num + " and " + rev + " are twisted prime numbers.");
        } else {
            System.out.println(num + " and " + rev + " are not twisted prime numbers.");
        }

    }
}