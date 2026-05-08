class Test1 {
    static int x = 10;
    static {
        System.out.println(x);
        x = 20;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}