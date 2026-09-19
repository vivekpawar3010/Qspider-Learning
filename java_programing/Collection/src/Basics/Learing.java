package Basics;


	


class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child method");
    }
}

public class Learing {

    public static void main(String[] args) {

        String child1 = new String("adfas");
        String child2 = new String("adfas");

        // Upcasting
//        Parent parent = child;

        // NPE because parent contains null
//        parent.show();
        
        System.out.println(child1.hashCode());
        System.out.println(child2.hashCode());
//        if(child instanceof Parent) {
//        	System.out.println("this is ok");
//        }else System.out.println("this is not ok");
    }
}