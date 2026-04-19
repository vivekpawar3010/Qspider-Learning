public class BuzzNumber {
    public static void main(String[] args) {
        int number = new java.util.Scanner(System.in).nextInt();
        if (number % 7 == 0 || number % 10 == 7;) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
    }
}