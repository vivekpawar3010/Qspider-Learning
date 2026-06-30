public class Test3 {
    static int x = 10;
    static {
        x = x++ + ++x;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
