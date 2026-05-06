package JoinPremium.Practice;

public class Dimond {
    public static void main(String[] args) {
        int n = 11;
        PascalDimond(n);
        if(n < 20) return;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j + i < n/2 || i + j + 1> 3*n/2 || j - i > n/2 || i - j > n/2){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void PascalDimond(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2+ 1; j++) {
                if(j + i < n/2 || i + j + 1> 3*n/2 || j - i > n/2 || i - j > n/2){
                    System.out.print("  ");
                }else{
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}
