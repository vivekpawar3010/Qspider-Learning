package java_programing.LoopExamples;

public class LMC {
    public static void main(String[] args) {
        int num1 = new java.util.Scanner(System.in).nextInt();
        int num2 = new java.util.Scanner(System.in).nextInt();
        int large = (num1 > num2) ? num1 : num2;
        int i = 1;
        while (true) {
            if ((large * i) % num1 == 0 && (large * i) % num2 == 0) {
                System.out.println("LMC of " + num1 + " and " + num2 + " is: " + (large * i));
                break;
            }
            i++;
        }
    }
}
