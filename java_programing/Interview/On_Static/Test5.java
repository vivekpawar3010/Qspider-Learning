public class Test5 {
    static int x = method();

    public static void main(String[] args) {
        System.out.println(x);
    }

    static int method() {
        System.out.println("Method");
        return 100;
    }

    static {
        System.out.println("Static");
        System.out.println(x);
        Test5.main(null);
    }
}
