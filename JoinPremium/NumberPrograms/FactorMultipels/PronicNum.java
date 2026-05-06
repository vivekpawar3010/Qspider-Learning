package JoinPremium.NumberPrograms.FactorMultipels;

// Pronic (Heteromecic) Number: A number that is the product of two consecutive integers.
// Example: 12 = 3 * 4
public class PronicNum {
    public static boolean isPronic(int n) {
        if (n < 0) return false;
        int k = 0;
        while(k * (k + 1) < n){
            k++;
        }
        return k * (k + 1) == n;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int k = 1;
        while (k * (k + 1) < n) {
            k++;
        }
        if (k * (k + 1) == n) {
            System.out.println("The given number is the Pronic number");
        }else{
            System.out.println("The given number is not the pronic number");
        }
    }
}
