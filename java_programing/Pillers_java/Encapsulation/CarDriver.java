package Pillers_java.Encapsulation;

public class CarDriver {

    public static void main(String[] args) {
        Car c1 = new Car("Mahindra", 3500000, "XUV700");

        c1.displayDetails();

        System.out.println("-------------------------");

        c1.getEngine().showInfo();
    }
}
