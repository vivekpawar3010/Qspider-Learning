package program11;

import java.util.*;

class VolumeOfCylinder {
    public static void mai  n(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Cylinder:");
        double r = sc.nextDouble();

        System.out.println("Enter the height of Cylinder:");
        double h = sc.nextDouble();

        double area = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;

        System.out.println("Surface Area of Cylinder = " + area + " and Volume of Cylinder = " + volume);
    }
}
