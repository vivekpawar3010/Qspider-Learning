package java_programing.NestedLoop;

public class AllXylemPhloemNumInRange {
    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        String ListOfXylemNum = "";
        String ListOfPhloemNum = "";

        for (int i = start; i <= end; i++) {
            int num = i;
            int sumOfFirstDigits = 0;
            int sumOfLastDigits = num % 10;
            int temp = num / 10;

            while (temp > 0) {
                sumOfFirstDigits += temp % 10;
                temp /= 10;
            }

            if (sumOfFirstDigits == sumOfLastDigits) {
                ListOfXylemNum += num + ", ";
            } else {
                ListOfPhloemNum += num + ", ";
            }
        }

        System.out.println("Xylem Numbers: " + ListOfXylemNum);
        System.out.println("Phloem Numbers: " + ListOfPhloemNum);
    }
}
