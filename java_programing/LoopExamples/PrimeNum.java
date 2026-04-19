package java_programing.LoopExamples;

public class PrimeNum {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();

        for (int i = 2; i <= num; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " is a prime number.");
                    break;
                }
            }

        }
    }
}
