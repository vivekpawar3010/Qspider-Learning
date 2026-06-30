package src;

public class CarDrive {
    public static void main(String[] args) {

        System.out.println("------------------- Creating the first object -------------------");
        Car bmw = new Car("BMW", 4580000.0, "BMW 2 Series Gran Coupe");
        bmw.displycar();

        System.out.println("\n------------------- Creating the second object -------------------");
        Car RR = new Car("Rolls-Royce", 75000000.0, "Cullinan", "Black", 250, "6.75L V12");
        RR.displycar();

        System.out.println("\n------------------- Creating the third object -------------------");
        Car Macydies = new Car("Mercedes-Benz", 4600000.0, "A-Class Limousine", "White", 230);
        Macydies.displycar();

        System.out.println("\n------------------- Creating the fourth object -------------------");
        Car Jagwar = new Car("Jaguar", 7290000.0, "XF", "Red", 250);
        Jagwar.displycar();
    }
}
