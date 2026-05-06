package JoinPremium.NumberPrograms.StructuralPositional;

// Automorphic Number: A number whose square ends with the same digits as the number itself.
// Example: 5 -> 25, 25 -> 625
public class AutomorphicNum {
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        while (n > 0 && sq > 0) {
            if (n % 10 != sq % 10) {
                return false;
            }
            n /= 10;
            sq /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int sq = n * n;
        boolean isAutomorphic = true;
        while (n != 0 && sq != 0) {
           if(n % 10 != sq % 10){
            isAutomorphic = false;
           }
           n /= 10;
           sq /= 10;
        }
        if(isAutomorphic){
            System.out.println("The Given number is a Automorphic Number");
        }else{
            System.out.println("The given number is not a Automorphic nubmer.");
        }

    }
}
