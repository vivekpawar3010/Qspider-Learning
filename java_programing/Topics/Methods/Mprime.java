public class Mprime {

    public static void main(String[] args) {
        int n = 100;

    }

    public static void prime(int num) {
        if (num <= 1) {
            System.out.println("Number is not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            prime(i);
        }
    }
}