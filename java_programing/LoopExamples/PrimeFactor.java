public class PrimeFactor {
    public static void main(String[] args) {
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println("Prime factors of " + num + " are:");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
    }
}
