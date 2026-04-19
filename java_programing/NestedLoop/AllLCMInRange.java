package java_programing.NestedLoop;

public class AllLCMInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                int num1 = i;
                int num2 = j;
                int large = (num1 > num2) ? num1 : num2;
                int k = 1;
                while (true) {
                    if ((large * k) % num1 == 0 && (large * k) % num2 == 0) {
                        System.out.println("LMC of " + num1 + " and " + num2 + " is: " + (large * k));
                        break;
                    }
                    k++;
                }
            }
        }
    }
}
