package JoinPremium.Pattern.Number;

public class SnakeNumPattern {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        System.out.println("ooooooooooooooooooooooooooooo");
        int oddToeven = 2 * n - 1;
        int evenToodd = 2;


        
        for(int i = 1; i <= n; i++) {
            int num = i;
            evenToodd = (i - 1) * 2 ;
        
            for(int j = 1; j <= i; j++) {
                System.out.print(num + "  ");
                // System.out.print("number:- " + " " + num + "  ");
                // System.out.print("odd to even: " + oddToeven + "  ");
                // System.out.print("even to odd: " + evenToodd + "  ");
                num += (j % 2 == 1? oddToeven:evenToodd);
                evenToodd -= 2;
            }

            oddToeven -= 2;
            System.out.println();
        }

    }
}
