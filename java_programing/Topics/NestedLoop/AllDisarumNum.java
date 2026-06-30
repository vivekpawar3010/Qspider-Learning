package java_programing.NestedLoop;

public class AllDisarumNum {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0;
            int count = 0;

            for (int i = num; i > 0; i /= 10) {
                count++;
            }

            for (int i = num; i > 0; i /= 10) {
                int last = i % 10;
                int prod = 1;
                int countCopy = count;
                while (countCopy > 0) {
                    prod *= last;
                    countCopy--;
                }
                sum += prod;
                count--;
            }

            if (sum == num) {
                System.out.println(num + " is a Disarium Number");
            }
        }
    }
}
