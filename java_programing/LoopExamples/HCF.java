package java_programing.LoopExamples;

public class HCF {
    public static void main(String[] args) {
        int num1 = new java.util.Scanner(System.in).nextInt();
        int num2 = new java.util.Scanner(System.in).nextInt();
        int small = (num1 < num2) ? num1 : num2;

        for (int i = small; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("HCF of " + num1 + " and " + num2 + " is: " + i);
                break;
            }
        }
    }
}
