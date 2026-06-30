package java_programing.NestedLoop;

public class AllPerfectNumInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();
        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i + " is a perfect number.");
            }
        }
    }
}
