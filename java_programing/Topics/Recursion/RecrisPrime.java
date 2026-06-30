public class RecrisPrime {
    public static void main(String args[]) {
        System.out.println("This is Start of the Main Method");
        System.out.print("Enter the number to check it is Prime number Or not:- ");
        try {

            int num = new java.util.Scanner(System.in).nextInt();
            int prime = isPrime(num, 2);
            System.out.println("The number " + num + " is divisible by number " + prime);

        } catch (StackOverflowError e) {
            System.err.println("The code Have to many Stack Frame Creation So Update the code");
            System.err.println("I handled the error of stack over flow");

        }
        System.out.println("This is End of the Main Method");

    }

    public static int isPrime(int num, int den) {
        if (den < num / 2) {
            if (num % den == 0) {
                return den;
            }
            return isPrime(num, den++);
        }
        return num;

    }
}
