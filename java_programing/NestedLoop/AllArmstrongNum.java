package java_programing.NestedLoop;

public class AllArmstrongNum {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0;
            for (int i = num, temp = num; i > 0; i /= 10) {
                int last = temp % 10;
                sum += last * last * last;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong Number");
            }
        }
    }
}
