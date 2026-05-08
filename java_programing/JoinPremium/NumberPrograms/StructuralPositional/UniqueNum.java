package JoinPremium.NumberPrograms.StructuralPositional;

// Unique Number: A number that has no duplicate digits.
// Example: 1234 is unique; 1224 is not.
public class UniqueNum {
    public static boolean isUnique(int n) {
        for (int i = 0; i <= 9; i++) {
            int ct = 0;
            for (int j = n; j != 0; j /= 10) {
                if (j % 10 == i)
                    ct++;
            }
            if (ct >= 2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        boolean isUnique = true;
        for (int i = 0; i <= 9; i++) {
            int ct = 0;
            for (int j = n; j != 0; j /= 10) {
                if (j % 10 == i)
                    ct++;
            }
            if (ct >= 2)
                isUnique = false;
        }
        if (isUnique) {
            System.out.println("The given number is a Unique number");
        } else {
            System.out.println("The given Number is not a Unique number");
        }
    }
}
