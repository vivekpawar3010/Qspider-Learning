class Test7 {

    static int x = 100;

    static {
        x = method();
    }

    public static int method() {

        x = x + 20;

        return x;
    }

    public static void main(String[] args) {

        System.out.println(x);
    }
}