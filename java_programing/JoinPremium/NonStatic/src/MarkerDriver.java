package src;

public class MarkerDriver {

    public static void main(String[] args) {
        System.out.println("this is form the main class");
        Marker m1 = new Marker();
        System.out.println(m1.brand);
        System.out.println(m1.color);
        System.out.println(m1.price);
        System.out.println("this is stativc varablr" + Marker.a);

        Marker m2 = new Marker();
        System.out.println("End of the main");
    }
}