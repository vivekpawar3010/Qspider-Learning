package src;

public class Test {
    static int a = 10;
    int b = 1000;

    public static void staticMethod() {
        System.out.println(a);
        // System.out.println(b); // we can not use the no static variable in the static
        // block
    }

    public void nonStaticMethod() {
        System.out.println(a);
        System.out.println(b);
    }
}
