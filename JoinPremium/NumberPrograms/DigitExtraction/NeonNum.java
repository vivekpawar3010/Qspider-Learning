package JoinPremium.NumberPrograms.DigitExtraction;
// Neon Number: A number where the sum of the digits of its square equals the original number.

// Example: 9 (Square is 81. Sum of digits: 8+1 = 9)

public class NeonNum {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int sq = n * n;
        int sqSum = 0;
        while(sq > 0){
            sqSum += sq % 10;
            sq /= 10;
        }
        if(sqSum == n){
            System.out.println("The entred number is a Neon Number");
        }else{
            System.out.println("This is not a neon number.");
        }
    }
    public static boolean isNeon(int n){
        int sq = n * n;
        int sqSum = 0;
        while(sq > 0){
            sqSum += sq % 10;
            sq /= 10;
        }
        if(sqSum == n) return true;
        return false;
    }
}
