package java_programing.NestedLoop;

public class PrintFact {

    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        while (start <= end) {
            int fact = 1;
            for (int i = start; i > 1; i--) {
                fact *= i;
            }
            System.out.println(fact);
            start++;
        }
    }
}