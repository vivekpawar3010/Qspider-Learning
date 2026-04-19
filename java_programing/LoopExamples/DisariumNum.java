package java_programing.LoopExamples;

public class DisariumNum {

    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
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
        } else {
            System.out.println(num + " is not a Disarium Number");
        }
    }
}