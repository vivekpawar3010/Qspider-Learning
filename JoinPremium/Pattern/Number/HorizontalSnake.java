package JoinPremium.Pattern.Number;

public class HorizontalSnake {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int num = 1;
        for(int i = 1; i < n; i++){
            num += (i % 2 == 0? n * 2 - 1: 1);
            System.out.print(num);
        }
        if(n > 0) return ;
        // int num = 1;
        for(int i = 0; i < n; i++) {
            int num1 = num;
            for(int j = 0; j < n; j++) {
                System.out.print(num + "  ");
                num1 += (i%2 == 0? -1:1);

            }

            num += (i % 2 == 1? n:1)
            System.out.println();
        }
    }
}
