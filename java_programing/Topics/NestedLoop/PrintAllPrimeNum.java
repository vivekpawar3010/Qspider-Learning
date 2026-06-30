package java_programing.NestedLoop;

public class PrintAllPrimeNum {

    public static void main(String[] args) {
        int start = new java.util.Scanner(System.in).nextInt();
        int end = new java.util.Scanner(System.in).nextInt();

        if (start < 2) {
            start = 2;
        }
        String ListOfPrimeNum = "";
        String ListOfNonPrimeNum = "";

        while (start <= end) {
            boolean prime = true;
            for (int i = 2; i < start / 2; i++) {
                if (start % i == 0) {
                    prime = false;
                    ListOfNonPrimeNum += start + ", ";
                    // System.out.println(start + " is not a prime number it is divisible by " + i);
                    break;
                }
            }
            if (prime) {
                ListOfPrimeNum += start + ", ";
                // System.out.println(
                // start + " is a prime number which is not divisible by any number except 1 and
                // " + start);
            }
            start++;
        }
        System.out.println("this is the list of the Prime number ;- " + ListOfPrimeNum);
        System.out.println("this is the list of the Non-Prime number ;- " + ListOfNonPrimeNum);

    }
}