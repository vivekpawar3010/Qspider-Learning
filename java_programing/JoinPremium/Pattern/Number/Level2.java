package JoinPremium.Pattern.Number;

public class Level2 {

    public static void main(String[] args) {
        System.out.println("this is the level 2 codes ");
        int n = 3;
        System.out.println("Pattern 1");
        Pattern1(n);
        System.out.println("Pattern 2");
        Pattern2(n);
    }

    public static void Pattern1(int n){
        for(int i = 0; i < n; i++) {
            int num = i + 1;
            for(int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num += n;
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        int evendiff = (n * 2) - 1, odddiff = 1;
        for(int i = 0; i < n; i++) {
            int num = i + 1;
            for(int j = 0; j < n; j++) {
                System.out.print(num + " ");
                if(j % 2 == 0) num += evendiff;
                else num += odddiff;

            }
            odddiff += 2;
            evendiff -= 2;
            System.out.println();
        }
    }



}