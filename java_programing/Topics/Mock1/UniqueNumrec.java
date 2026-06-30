package Mock1;

public class UniqueNumrec {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        boolean unique = true;
        for(int i = n; i != 0; i /= 10){
            int freq = freq(n, i % 10);
            if(freq >= 2){
                unique = false;
                break;
            }
        }
        if(unique){
            System.out.println("Unique Number");
        } else {
            System.out.println("Not Unique Number");
        }
    }
    public static int freq(int n, int d){
        if(n == 0){
            return 0;
        }
        return (n % 10 == d ? 1 : 0) + freq(n / 10, d);1
    }
}
