package java_programing.NestedLoop;

public class AllPrimeFactorInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();

        int end = new java.util.Scanner(System.in).nextInt();

        if (start < 2) {
            start = 2;
        }
        while (start <= end) {
            int num = start;
            System.out.println("Prime factors of " + num + " are:");
            for (int i = 2; i <= num; i++) {
                while (num % i == 0) {
                    System.out.print(i + " ");
                    num = num / i;
                }
            }
        }
    }
}
