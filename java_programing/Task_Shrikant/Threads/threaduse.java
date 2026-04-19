package Threads;

public class threaduse {
    public static void main(String[] args)
            throws InterruptedException {
        System.out.print("Enter the string ");
        String str = new java.util.Scanner(System.in).nextLine();
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
            Thread.sleep(300);
        }
    }
}
