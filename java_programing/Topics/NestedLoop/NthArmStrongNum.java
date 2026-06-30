package java_programing.NestedLoop;

public class NthArmStrongNum {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int count = 0;
        while (true) {
            int sum = 0;
            for (int i = num, temp = num; i > 0; i /= 10) {
                int last = temp % 10;
                sum += last * last * last;
                temp /= 10;
            }
            if (sum == num) {
                count++;
                if (count == num) {
                    System.out.println(num + " is the " + num + "th Armstrong Number");
                    break;
                }
            }
            num++;
        }
    }
}
