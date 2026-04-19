package java_programing.NestedLoop;

public class AllPrimeInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();

        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i <= end; i++) {
            int num = new java.util.Scanner(System.in).nextInt();

            for (int k = 2; k <= num; k++) {

                for (int j = 2; j < k; j++) {
                    if (k % j == 0) {
                        System.out.println(k + " is not a prime number it is divisible by " + j);
                        break;
                    }
                }
            }
        }
    }
}
