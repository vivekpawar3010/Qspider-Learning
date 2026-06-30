package Topics.LoopExamples;

public class XylemPhloem {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println("Les's Check this number is Xylem or Phloem of " + num + " or not.");
        int sumOfFirstDigits = 0;
        int sumOfLastDigits = num % 10;
        int temp = num / 10;

        while (temp > 0) {
            sumOfFirstDigits += temp % 10;
            temp /= 10;
        }

        if (sumOfFirstDigits == sumOfLastDigits) {
            System.out.println(num + " is a Xylem number.");
        } else {
            System.out.println(num + " is a Phloem number.");
        }
    }
}
