public class ReversNum {

    public static void main(String[] args) {
        System.out.print("Enter the numver to check it's Palindrom");
        int num = new java.util.Scanner(System.in).nextInt();
        int rev = 0;
        for (int i = num; i > 0; i++) {
            int ld = i % 10;
            rev = rev * 10 + ld;
        }
        System.err.println(num);
        System.out.println(rev);
    }
}