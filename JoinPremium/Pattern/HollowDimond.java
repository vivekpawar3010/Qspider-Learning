package JoinPremium.Pattern;

public class HollowDimond {
    public static void main(String[] args) {
        int n = 11;

        hollowDimond(n);
        if(n == 11) return;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i + j - 1 < n/2 || i + j +1> 3 * n / 2 - 1 || j - i + 1> n/2 || i - j + 1 > n/2){
                System.out.print("* ");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowDimond(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i + j == n/2 || i + j == 3 * n / 2 - 1 || j - i == n/2 || i - j == n/2){
                System.out.print("* ");
                }else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
