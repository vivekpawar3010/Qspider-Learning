package JoinPremium;

public class SumOfMiddelDig {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        n /= 10; // removed the last dig

        int sumMid = 0;
        while (n > 9) {
            sumMid += n % 10;
            n /= 10;
        }
        System.out.println("The Sum of middle dig of the entered number is " + sumMid);

    }
}
