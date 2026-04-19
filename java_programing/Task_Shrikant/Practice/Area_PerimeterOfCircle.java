package program11;

import java.util.*;

class Area_PerimeterOfCircle {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle:");
        double r = sc.nextFloat();

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out
                .println("The Perimeter of the Circle is " + perimeter + " and  Area of the Circle is " + area + " .");

    }
}