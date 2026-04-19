package java_programing.NestedLoop;

public class AllPronicNumInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        for (int i = start; i <= end; i++) {
            int num = i;
            int product = 0;
            for (int j = 1; j <= num; j++) {
                product = j * (j + 1);
                if (product == num) {
                    System.out.println(num + " is a pronic number.");
                    break;
                } else if (product > num) {
                    // System.out.println(num + " is not a pronic number.");
                    break;
                }
            }
        }
    }
}
