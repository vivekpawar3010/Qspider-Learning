package src;

public class UpdatedCarDriver {
    public static void main(String[] args) {

        System.out.println("------------------- Creating the first object -------------------");
        UpdatedCar bmw = new UpdatedCar("BMW", 4580000.0, "BMW 2 Series Gran Coupe");
        bmw.displyUpdatedCar();

        System.out.println("\n------------------- Creating the second object -------------------");
        UpdatedCar RR = new UpdatedCar("Rolls-Royce", 75000000.0, "Cullinan", "Black", 250, "6.75L V12");
        RR.displyUpdatedCar();

        System.out.println("\n------------------- Creating the third object -------------------");
        UpdatedCar Macydies = new UpdatedCar("Mercedes-Benz", 4600000.0, "A-Class Limousine", "White", 230);
        Macydies.displyUpdatedCar();

        System.out.println("\n------------------- Creating the fourth object -------------------");
        UpdatedCar Jagwar = new UpdatedCar("Jaguar", 7290000.0, "XF", "Red", 250);
        Jagwar.displyUpdatedCar();
    }
}
