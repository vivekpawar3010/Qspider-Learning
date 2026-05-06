package JoinPremium.Pattern;

public class RevArrow {
    public static void main(String[] args) {
        int n = 13;
        int space = n/2;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2 + 1; j++) {
                if(j < space){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            if(i < n/2) space--;
            else space++;
            System.out.println();
        }
        
    }

    public static void MyRevArrow(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2 + 1; j++) {
                if(j < ((i < n/2? n/2-i:i-n/2))){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
