package Pillers_java.Encapsulation;

public class PenRifil {
    private String brand;
    private String color;
    private double price;

    public PenRifil() {
    }

    public PenRifil(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Refill Brand: " + brand);
        System.out.println("Refill Color: " + color);
        System.out.println("Refill Price: " + price);
    }
}
