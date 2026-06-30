package src;

public class Marker {
    final String brand = "Dom";
    double price;
    String color;
    static int a;

    {
        System.out.println("this is from not static block");
        System.out.println(price);
        String brand = "nataraj";
        System.out.print(brand);
        System.out.println("this is from not static block");

    }

    static {
        System.out.println("staticstaticstaticstaticstaticstaticstaticstaticstatic");
        System.out.println("this is form the static block");
        a = 100;
        System.out.println(a);
        System.out.println("staticstaticstaticstaticstaticstaticstaticstaticstatic");

    }
}
