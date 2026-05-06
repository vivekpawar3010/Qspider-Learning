package JoinPremium.Practice;

public class PascalDamaru {
    public static void main(String[] args) {
        int n = 11;
        // int n = new java.util.Scanner(System.in).nextInt();
        for(int i = 1; i <= n; i++){
            for(int j=1; j <= n/2+1; j++){
                if((j < i || j > n - i + 1) && (j < n - i + 1 || j > i)){
                    System.out.print("  ");
                } else {
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}
