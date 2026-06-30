package Topics.LoopExamples;

public class PronicNum {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        int product = 0;
        for (int i = 1; i <= num; i++) {
            product = i * (i + 1);
            if (product == num) {
                System.out.println(num + " is a pronic number.");
                break;
            } else if (product > num) {
                System.out.println(num + " is not a pronic number.");
                break;
            }
        }
    }
}
