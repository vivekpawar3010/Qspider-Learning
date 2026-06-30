package Pillers_java.Encapsulation;

public class PenBody {
    private String brand;
    private String material;
    private PenRifil rifil = new PenRifil("Flair", "Green", 15.0);

    public PenBody() {
    }

    public PenBody(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    public PenRifil getRifil() {
        return rifil;
    }

    public void displayDetails() {
        System.out.println("Pen Brand -:- " + brand);
        System.out.println("Pen Material -:- " + material);
    }
}
