package JoinPremium.Pattern;

public class FullArrow {
    public static void main(String[] args) {
        int n = 11;
        MyArrow(n);
        if(n == 11) return;
        int star = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if(i < n/2) star += 2;
            else star -= 2;
            System.out.println();
        }
    }

    public static void MyArrow(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < ((i <= n/2? i*2 + 1:(n-i)*2 - 1)); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
