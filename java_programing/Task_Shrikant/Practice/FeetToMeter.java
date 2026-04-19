package program11;

import java.util.*;

class FeetToMeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value in feet:    ");
        double feet = sc.nextDouble();

        double meter = feet * 0.305;

        System.out.println(feet + " feet is  " + meter + " meters");
    }
}
