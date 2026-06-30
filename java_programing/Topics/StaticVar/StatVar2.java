package java_programing.StaticVar;

public class StatVar2 {
    static {
        System.out.println("Static block in StatVar2 is called");
        System.out.println("Static block in StatVar2 is executed before the main method of StatVar2");
    }

    public static void main(String[] args) {
        System.out.println("Main method in StatVar2 is called");
        System.out.println("Main method in StatVar2 is the entry point of the program");
        System.out.println("Main method in StatVar2 is executed after the static block of StatVar2");
        System.out.println("we can use the static variable of StatVar1 in StatVar2 without creating an object");
        System.out.println("Static variable value from StatVar1: " + StatVar1.staticVar);
        System.out.println("we can also call the static method of StatVar1 in StatVar2 without creating an object");
        StatVar1.method2();
        StatVar1.method1();
        StatVar1.main(null);
    }
}
