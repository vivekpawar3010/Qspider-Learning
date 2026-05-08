package JoinPremium.Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n = 11;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if((j <= i && i + j <= n) || (j >= i && i + j + 1 >= n)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }   
}
