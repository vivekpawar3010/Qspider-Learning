package java_programing.NestedLoop;

public class AllTwistedNumInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i <= end; i++) {
            int num = new java.util.Scanner(System.in).nextInt();
            boolean numprime = true;
            for (int j = 2; j <= num; j++) {

                if (num % j == 0) {
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
            for (int j = 2; j <= rev; j++) {

                if (rev % j == 0) {
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
}
