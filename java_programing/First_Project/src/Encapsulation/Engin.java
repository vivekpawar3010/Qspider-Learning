package Pillers_java.Encapsulation;

public class Engin {
    private String brand;
    private String fuelType;
    private int cc;
    private double price;

    private Engin() {
    }

    public Engin(String brand, String fuelType, int cc, double price) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.cc = cc;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Engine Brand: " + brand);
        System.out.println("Engine Fuel Type: " + fuelType);
        System.out.println("Engine CC: " + cc);
        System.out.println("Engine Price: " + price);
    }
}
