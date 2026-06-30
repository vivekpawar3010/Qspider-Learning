package java_programing.NestedLoop;

public class AllHCFInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                int num1 = i;
                int num2 = j;
                int small = (num1 < num2) ? num1 : num2;

                for (int k = small; k >= 1; k--) {
                    if (num1 % k == 0 && num2 % k == 0) {
                        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + k);
                        break;
                    }
                }
            }
        }
    }
}
