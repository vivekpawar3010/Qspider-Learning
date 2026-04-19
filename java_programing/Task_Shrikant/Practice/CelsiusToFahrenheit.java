package program11;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        System.out.println("Enter the temprature in degree Celsius");
        double celsius = new java.util.Scanner(System.in).nextDouble();
        double fahrenheit = celsius * (9 / 5) + 32;

        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit");
    }

}
