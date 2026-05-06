package JoinPremium.NumberPrograms.StructuralPositional;

// Duck Number: A number that contains at least one zero digit, but the leading digit cannot be zero.
// Example: 203 is a duck number; 023 is not (leading zero)
public class DuckNum {
    public static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        boolean isDuck = false;
        while (n > 0) {
            if (n % 10 == 0)
                isDuck = true;
            n /= 10;
        }
        if (isDuck) {
            System.out.println("the Given nubmer is a Duck Number");
        } else {
            System.out.println("the Given nubmer is not a Duck Number");
        }
    }
}
