public class Test5 {
    static int x = method();

    static {
        System.out.println("Static");
    }

    public static void main(String[] args) {
        System.out.println(x);
    }

    static int method() {
        System.out.println("Method");
        return 100;
    }
}
