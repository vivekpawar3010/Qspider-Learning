package Topics.LoopExamples;

public class ArmstrongNum {

    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        int count = 0;
        for (int i = num, temp = num; i > 0; i /= 10) {
            count++;
            temp /= 10;
        }
        for (int i = num, temp = num; i > 0; i /= 10) {
            int last = temp % 10;
            for (int j = 1; j < count; j++) {
                last *= temp % 10;
            }
            sum += last;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}