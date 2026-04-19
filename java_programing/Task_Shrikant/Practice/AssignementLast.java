package program11;

public class AssignementLast {
    public static void main(String[] args) {
        // * 1. Reverse a number
        int num1 = new Scanner(System.in).nextInt();

        int rev = 0;
        for (int i = num1; i > 0; i /= 10) {
            int ld = i % 10;
            rev = rev * 10 + ld;
        }
        System.out.println(rev);

        // * 2. Reverse a string
        String str = new Scanner(System.in).nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);

        // * 3. Palindrome 2 pinter approach
        String str2 = new Scanner(System.in).nextLine();
        for (int i = 0, j = str2.length() - 1; i < j; i++, j--) {
            if (str2.charAt(i) != str2.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");

        // * 4. Power of number
        int num4 = new Scanner(System.in).nextInt();
        int pow = new Scanner(System.in).nextInt();
        int res = 1;
        if (pow < 0) {
            num4 = 1 / num4;
            pow = -pow;
        }
        for (int i = 0; i < pow; i++) {
            res *= num4;
        }
        System.out.println(res);

    }
}
