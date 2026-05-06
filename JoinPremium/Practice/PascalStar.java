package JoinPremium.Practice;

public class PascalStar {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n; j++){
                if(j < n - i){
                    System.out.print("  ");
                } else {
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}
