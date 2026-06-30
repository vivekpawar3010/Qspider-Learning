package java_programing.StaticVar;

public class StatVar1 {
    static {
        System.out.println("Static block is called");
        System.out.println("Static block allows you to initialize static variables");
        System.out.println("Static block is executed before the main method");
    }
    public static void main(String[] args) {
        System.out.println("Main method is called");
        System.out.println("Main method is the entry point of the program");
        System.out.println("Main method is executed after the static block");
    }
    public static void method1() {
        System.out.println("Method1 is called");
        System.out.println("Method1 is a static method");
        System.out.println("Method1 can be called without creating an object");
    }
    static int staticVar = 10;
    static void method2() {
        System.out.println("Method2 is called");
        System.out.println("Method2 is a static method");
        System.out.println("Method2 can access static variables");
        System.out.println("Static variable value: " + staticVar);
    }
    static {
        System.out.println("Another static block is called");
        System.out.println("Static blocks are executed in the order they are defined");
        System.out.println("Static blocks are executed before the main method");
        System.out.println("Static block can run other methods before the main method");
        method2();
        method1();

    }
}

