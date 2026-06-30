package Pillers_java.Encapsulation;

public class PenDriver {

    public static void main(String[] args) {
        PenBody p1 = new PenBody("Parker", "Metal");

        p1.displayDetails();

        System.out.println("-------------------------");

        p1.getRifil().showInfo();
    }
}
