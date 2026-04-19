import java.util.Scanner;

public class Break_Ex {
    public static void main(String[] args) {

        kuchtoh: {
            System.out.println("kuch toh starts");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("if executed");
            } else {
                System.out.println("else executed");
                break kuchtoh; // breaks the labeled block
            }

            System.out.println("kuch toh ends");
        }

        System.out.println("ends");
    }
}
