package Topics.LoopExamples;

public class NeonNum {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }
}
