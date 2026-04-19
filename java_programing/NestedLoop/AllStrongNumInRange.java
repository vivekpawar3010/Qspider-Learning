package java_programing.NestedLoop;

public class AllStrongNumInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0;
            for (int i = num, temp = num; i > 0; i /= 10) {
                int fact = 1;
                int last = temp % 10;
                while (last > 1) {
                    fact *= last;
                    last--;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is a Strong Number");
            }
        }
    }
}
