package src;

public class Car {
    // mandetory
    String brand;
    double price;
    String model;
    // optional
    String color;
    int highSpeed;
    String engin;

    // Car() {} // remode so no any car object without brand, price, model will be
    // created

    Car(String brand, double price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    Car(String brand, double price, String model, String color) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    Car(String brand, double price, String model, String color, int highspeed) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.color = color;
        highSpeed = highspeed;
    }

    Car(String brand, double price, String model, String color, int highSpeed, String engin) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.color = color;
        this.highSpeed = highSpeed;
        this.engin = engin;
    }

    public void displycar() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
        if (color != null)
            System.out.println("Color: " + color);
        if (highSpeed != 0)
            System.out.println("High Speed: " + highSpeed);
        if (engin != null)
            System.out.println("Engin: " + engin);

    }

}
