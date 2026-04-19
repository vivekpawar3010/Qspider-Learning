import java.util.Scanner;

public class KaprekarConstIterations {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "Enter the number in the range of 1000 to 9999 \n to get the number of itration reuqrued to get the kaprekar constant:- ");
            int num = scanner.nextInt();
            if (num <= 0) {
                System.out.println(
                        num + " Your entered Number is Less than of equal to 0 so We are exiting program........");
                System.out.println(
                        "//////////////////////////////// Code Termination Competed ///////////////////////////////");
                break;
            }
            if (num < 1000) {
                System.out.println(
                        num + " this number is less than 1000, So we can not consider it Enter Nother Number ");
                continue;
            } else if (num > 9999) {
                System.out.println(
                        num + " this number is greater than 9999, So we can not consider it Enter Nother Number ");
                continue;
            }
            int count = numOfIterToGetKaprekar(num);
            System.out.println(" The number of Iteration to get Kaprekar Const " + count + " for the number " + num);
            System.out.println("\n\n\n\n");
            System.out.println("//////////////////////////////// TO exit ///////////////////////////////");
            System.out.println("Enter the number 0 or less then 0");
            System.out.println("//////////////////////////////// TO exit ///////////////////////////////");

        }
    }

    public static int numOfIterToGetKaprekar(int num) {
        int count = 0;
        while (num != 6174) {
            int dec = DecOrd(num);
            System.out.println("The Order of dig in num in Dec Order: " + dec);

            int inc = IncOrd(num);
            System.out.println("The Order of dig in num in Inc Order: " + inc);

            num = dec - inc;
            if(num == 0) {
                System.out.println("The number is not valid for Kaprekar's process. It will never reach 6174.");
                return -1; // Indicating an invalid case
            }
            System.out.println("Intermediate result: " + num);
            System.out.println("\n\n\n\n");
            while (num < 1000) {
                num *= 10;
            }
            count++;
        }
        return count;
    }

    public static int DecOrd(int num) {
        int DecOrdNum = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = num; j > 0; j /= 10) {
                if (j % 10 == i) {
                    DecOrdNum = DecOrdNum * 10 + i;
                }
            }
        }
        while (num < 1000) {
            DecOrdNum *= 10;
        }
        return DecOrdNum;
    }

    public static int IncOrd(int num) {
        int IncOrdNum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = num; j > 0; j /= 10) {
                if (j % 10 == i) {
                    IncOrdNum = IncOrdNum * 10 + i;
                }
            }
        }
        return IncOrdNum;
    }
}
