package src;
public class LaptopDriver {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        l1.brand = "HP";
        l1.price = 70000.0;
        l1.ram = "16GB";
        l1.rom = "1TB";
        l1.processor = "i5";

        Laptop l2 = new Laptop();

        l2.brand = "HP";
        l2.price = 70000.0;
        l2.ram = "16GB";
        l2.rom = "1TB";
        l2.processor = "i5";

        System.out.println("For Laptop1");
        System.out.println("Brand: " + l1.brand);
        System.out.println("Price: " + l1.price);
        System.out.println("Ram: " + l1.ram);
        System.out.println("Rom: " + l1.rom);
        System.out.println("Processor: " + l1.processor);

        System.out.println();

        System.out.println("For Laptop2");
        System.out.println("Brand: " + l2.brand);
        System.out.println("Price: " + l2.price);
        System.out.println("Ram: " + l2.ram);
        System.out.println("Rom: " + l2.rom);
        System.out.println("Processor: " + l2.processor);

        System.out.println();
    }
}
