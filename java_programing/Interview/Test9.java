class Test9 {

    static int x = 5;

    static {
        x += ++x + x++ + ++x;
    }

    public static void main(String[] args) {
        System.out.println(x);
        int y = 5;
        y += y++ + ++y;
        System.out.println(y);
    }
}