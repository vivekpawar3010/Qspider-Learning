// File 1: Battary.java
package Pillers_java.Encapsulation;

public class Battary {
    private String brand;
    private String model;
    private int capacity;
    private double price;

    public Battary() {
    }

    public Battary(String brand, String model, int capacity, double price) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Battery Brand: " + brand);
        System.out.println("Battery Model: " + model);
        System.out.println("Battery Capacity: " + capacity + "mAh");
        System.out.println("Battery Price: " + price);
    }
}
