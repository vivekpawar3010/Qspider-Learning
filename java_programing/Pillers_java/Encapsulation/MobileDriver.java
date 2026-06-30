package Pillers_java.Encapsulation;

public class MobileDriver {

    public static void main(String[] args) {
        Mobile m1 = new Mobile("OnePlus", 85000, "12R");

        m1.displayDetails();

        System.out.println("-------------------------");

        m1.getB1().showInfo();
    }
}
