package JoinPremium.Pattern.Number;

public class SimpleNumber {
    public static void main(String[] args) {
        int n = 3;

        // Pattern 1
        System.out.println("This is pattern 1");
        Pattern1(n);
        System.out.println("This is pattern 2");
        Pattern2(n);
        System.out.println("This is pattern 3");
        Pattern3(n); 
        System.out.println("This is pattern 4");
        Pattern4(n);
        System.out.println("This is pattern 5");
        Pattern5(n);

    }

    public static void Pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i * n + j + 1+ "  ");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + 1 + "  ");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + 1 + "  ");
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n){
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num++ + "  ");
            }
            System.out.println();
        }
    }

    public static void Pattern5(int n){
        int num = 1;
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i % 2 != 0) System.out.print(num++ + "  ");
                else System.out.print(ch++ + "  ");
            }
            System.out.println();
        }
    }
}
