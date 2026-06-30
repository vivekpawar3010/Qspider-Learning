public class Ex {
    public static void main(String[] args) {

        int n = new java.util.Scanner(System.in).nextInt();

        int startingNum = 0;
        int space = 0;
        int numToPrint = 5;

        for (int i = n; i >= 1; i--) {

            startingNum += i;

            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print.3 numbers
            for (int j = 1; j <= numToPrint; j++) {
                System.out.print(startingNum-- + " ");
            }

            System.out.println();

            space++;
            numToPrint -= 2;
        }
    }
}