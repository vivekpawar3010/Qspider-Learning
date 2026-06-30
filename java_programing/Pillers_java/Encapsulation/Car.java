package Pillers_java.Encapsulation;

public class Car {
    private String brand;
    private double price;
    private String model;

    private Engin engine = new Engin("Toyota", "Diesel", 2755, 400000);

    private Car() {
    }

    public Car(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public Engin getEngine() {
        return engine;
    }

    public void displayDetails() {
        System.out.println("Car Brand -:- " + brand);
        System.out.println("Car Price -:- " + price);
        System.out.println("Car Model -:- " + model);
    }
}
