package JoinPremium;

public class SumOfFirstLastDig {

    public static void main(String vivek[]) {
        System.out.print("Enter the Nubmer of get Sum of first and last digit in it:--");
        int n = new java.util.Scanner(System.in).nextInt();
        int lastdig = n % 10;
        while (n > 9) {
            n /= 10;
        }
        int firstdig = n;
        System.out.println("The first dig of the entered number is " + firstdig);
        System.out.println("The last dig of the entered number is " + lastdig);
        System.out.println("The sum of last and  first dig of the entered number is " + (firstdig + lastdig));

    }
}