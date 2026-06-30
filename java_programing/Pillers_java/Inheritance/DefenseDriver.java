package Pillers_java.Inheritance;

public class DefenseDriver {

    public static void main(String[] args) {

        Army IndianArmy = new Army("Northern Command", "Udhampur", 300000, 15.5, 1895, 4000, "General Pande");
        IndianArmy.displayArmyDetails();

        Navy westernFleet = new Navy("Western Naval Command", "Mumbai", 75000, 8.2, 1950, 150, 15);
        westernFleet.displayNavyDetails();

        AirForce easternAirCommand = new AirForce("Eastern Air Command", "Shillong", 120000, 10.1, 1932, 600,
                "Dassault Rafale");
        easternAirCommand.displayAirForc    eDetails();
    }
}
