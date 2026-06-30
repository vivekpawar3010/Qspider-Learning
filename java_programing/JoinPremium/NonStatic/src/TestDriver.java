package src;
public class TestDriver {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1);
        Test.staticMethod();
        t1.nonStaticMethod();
        // Test t2 = new Test();
        // System.out.println(t1);
        // t1.staticMethod();

    }
}
