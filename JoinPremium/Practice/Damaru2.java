package JoinPremium.Practice;

public class Damaru2 {

    public static void main(String[] args) {
        int n = 11;
        // new java.util.Scanner(System.in).nextInt();
        

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if((j < i || j > n - i - 1) && (j > i || j < n - i -1)){
        //             System.out.print("_ ");
        //         }else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

       int space = 0;
        for(int i = 0; i < n; i++) { 
            // int it = (i <= n/2)? (n - i):(i + 1);
            for(int j = 0; j < ((i <= n/2)? (n - i):(i + 1)); j++) {
                if(j < space){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            if(i < n/2) space++;
            else space--;

            System.out.println();
        }
    }
}