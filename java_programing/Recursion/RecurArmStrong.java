
public class RecurArmStrong {

    public static void main(String[] args) {
        System.out.println("===========> Main Method Start <===============");

        System.out.print("Enter the Nubmer");
        try {
            int num = new java.util.Scanner(System.in).nextInt();
            int ct = RecrCountOfDig.countDig(num);
            int ans = isArmStrong(num, ct);
            System.out.println("The Given Number is ArmStrong if " + num + " = " + ans);
        } catch (StackOverflowError e) {
            System.err.println("\n**************************************************");
            System.err.println("*                                                *");
            System.err.println("*        CRITICAL ERROR: STACK OVERFLOW          *");
            System.err.println("*    Recursion depth exceeded memory limits!     *");
            System.err.println("*                                                *");
            System.err.println("**************************************************");

        }

        System.out.println("xxxxxxxxxxxxxxxx> Main Method End <xxxxxxxxxxxxxxxxxxxx");

    }

    public static int isArmStrong(int num, int ct) {
        if (num < 10)
            return RecurPow.powBR(num, ct);
        return RecurPow.powBR(num % 10, ct) + isArmStrong(num / 10, ct);
    }
}
