package Mock1;

public class Pattern1 {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int it = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= it * 2; j += 2){
                System.out.print(j + " ");
            }
            if(i < n / 2){
                it -= 2;
            } else if(i > n / 2){
                it += 2;
            }else{
                it -= 2;
            }
            System.out.println();
        }
    }
}
