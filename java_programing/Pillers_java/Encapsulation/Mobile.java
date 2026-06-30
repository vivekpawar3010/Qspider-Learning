package Pillers_java.Encapsulation;

public class Mobile {
    private String brand;
    private double price;
    private String model;

    private Battary b1 = new Battary("Sony", "Li-900", 5500, 12000);

    public Mobile(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public Battary getB1() {
        return b1;
    }

    public void displayDetails() {
        System.out.println("Brand -:- " + brand);
        System.out.println("Price -:- " + price);
        System.out.println("Model -:- " + model);
    }
}
