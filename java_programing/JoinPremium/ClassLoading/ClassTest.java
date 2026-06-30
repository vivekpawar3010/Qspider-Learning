public class ClassTest {
    static int a;
    static {
        System.out.println("this is form class test1 static block");
    }

    public static void main(String[] args) {
        System.out.println("this is main form test 1");
        System.out.println("not i am calling a variable from test 2");

        System.out.println(ClassTest2.a);
        System.out.println("not i am calling main from test 2");
        add();
        ClassTest2.main(null);
        ClassTest2.main(null);

    }

    public static void add() {
        System.out.println(ClassTest2.a);

    }
}