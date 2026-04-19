public class Mtechnum {
    public static void main(String[] args) {
        int n = 2025;
        technum(n);
        technumInRange(n, n + 200);

    }

    public static void technum(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a technum");
        } else {
            System.out.println(num + " is not a technum");
        }
    }

    public static void technumInRange(int n, int m) {
        for (int i = n; i <= m; i++) {
            technum(i);
        }
    }
}
