package JoinPremium.Pattern.Number;

public class PascalNum {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n; j++){
                if(j < n - i){
                    System.out.print("  ");
                } else {
                    System.out.print((int)factorial(i)/(factorial(j-n+i)*factorial(n-j)) + "   ");
                }
            }
            System.out.println();
        }
    }

    public static long factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
}
