package java_programing.NestedLoop;

public class AllTwinPrimesInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i <= end - 2; i++) {
            int num1 = i;
            int num2 = i + 2;

            boolean num1Prime = true;
            if (num1 < 2)
                num1Prime = false;
            for (int k = 2; k * k <= num1; k++) {
                if (num1 % k == 0) {
                    num1Prime = false;
                    break;
                }
            }

            if (num1Prime) {
                boolean num2Prime = true;
                if (num2 < 2)
                    num2Prime = false;
                for (int k = 2; k * k <= num2; k++) {
                    if (num2 % k == 0) {
                        num2Prime = false;
                        break;
                    }
                }

                if (num2Prime) {
                    System.out.println(num1 + " and " + num2 + " are twin prime numbers.");
                }
            }
        }
    }
}