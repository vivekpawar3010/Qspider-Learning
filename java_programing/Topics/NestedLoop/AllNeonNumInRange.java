package java_programing.NestedLoop;

public class AllNeonNumInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i <= end; i++) {
            int square = i * i;
            int sum = 0;

            while (square > 0) {
                int digit = square % 10;
                sum += digit;
                square /= 10;
            }

            if (sum == i) {
                System.out.println(i + " is a neon number.");
            }
        }
    }
}
