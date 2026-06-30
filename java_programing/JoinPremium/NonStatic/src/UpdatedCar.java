package src;

public class UpdatedCar {
    // mandetory
    String brand;
    double price;
    String model;
    // optional
    String color;
    int highSpeed;
    String engin;

    UpdatedCar() {
        System.out.println("From default constructor");
    } // remode so no any UpdatedCar object without brand, price, model will be
      // created

    UpdatedCar(String brand, double price, String model) {
        this();
        this.brand = brand;
        this.price = price;
        this.model = model;
        System.out.println("From all Mandatory values constructor");
    }

    UpdatedCar(String brand, double price, String model, String color) {
        this(brand, price, model);
        this.color = color;
        System.out.println("From all Mandatory and 1 non-mandatory constructor");
    }

    UpdatedCar(String brand, double price, String model, String color, int highspeed) {
        this(brand, price, model, color);
        highSpeed = highspeed;
        System.out.println("From all Mandatory and 2 non-mandatory constructor");

    }

    UpdatedCar(String brand, double price, String model, String color, int highSpeed, String engin) {
        this(brand, price, model, color, highSpeed);
        this.engin = engin;
        System.out.println("From all Mandatory and all non-mandatory constructor");

    }

    public void displyUpdatedCar() {
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
