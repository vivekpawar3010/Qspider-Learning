package JoinPremium.Pattern;

public class Arrow {
    public static void main(String[] args) {
        int n =13;
        int star = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if(i < n/2) star++;
            else star--;
            System.out.println();
        }
        
        
    }

    public static void MyArrow(int n){
         for(int i = 0; i < n; i++) {
            for(int j = 0; j < (i < n/2? i + 1: n-i); j++) {
                
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

    public static void HollowArrow(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n; j++) {
                if((j <= i  && i <= n/2) || (j < n - i && i > n/2)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
