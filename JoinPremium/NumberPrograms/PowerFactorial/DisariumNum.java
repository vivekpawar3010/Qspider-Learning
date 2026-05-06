package JoinPremium.NumberPrograms.PowerFactorial;


// Disarium Number: A number where the sum of its digits powered to their respective positions equals the original number.

// Example: 135 (1¹ + 3² + 5³ = 1 + 9 + 125 = 135)


public class DisariumNum {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int count = 0;
        for(int i = n; i > 0; i /= 10) {
            count++;
        }
        int sum = 0;
        int temp = n;
        for (int i = count; i > 0; i--) {
            int d = temp % 10;
            int power = 1;
            for (int j = 0; j < i; j++) {
                power *= d;
            }
            sum += power;
            temp /= 10;
        }
        System.out.println(sum == n ? "Disarium number." : "Not a disarium number.");
    }

    public static boolean isDisarium(int n) {
        int count = 0;
        for(int i = n; i > 0; i /= 10) {
            count++;
        }
        int sum = 0;
        int temp = n;
        for (int i = count; i > 0; i--) {
            int d = temp % 10;
            int power = 1;
            for (int j = 0; j < i; j++) {
                power *= d;
            }
            sum += power;
            temp /= 10;
        }
        return sum == n;
    }
}
