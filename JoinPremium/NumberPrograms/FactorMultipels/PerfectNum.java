package JoinPremium.NumberPrograms.FactorMultipels;

// Perfect Number: A number equal to the sum of its proper divisors (excluding the number itself).
// Example: 6 -> 1 + 2 + 3 = 6
public class PerfectNum {
    public static boolean isPerfect(int n) {
        if (n <= 1)
            return false;
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
       int n = new java.util.Scanner(System.in).nextInt();
      
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        if(sum == n){
            System.out.println("The given number is a perfect nubmer");
        }else{
            System.out.println("The Given number is not a perfect number.");
        }
    }
}
