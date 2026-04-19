package java_programing.NestedLoop;

public class NthStrongNum {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int count = 0;
        while (true) {
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
                count++;
                if (count == num) {
                    System.out.println(num + " is the " + num + "th Strong Number");
                    break;
                }
            }
            num++;
        }
    }
}
