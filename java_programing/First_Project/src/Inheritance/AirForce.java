package Inheritance;

public class AirForce extends Defense {

    int numberOfFighterJets;
    String mainAircraftType;

    public AirForce() {
        // Default constructor
    }

    AirForce(String commandName, String headquarters, int activePersonnel, double budgetInBillions, int establishedYear,
            int numberOfFighterJets, String mainAircraftType) {
        super(commandName, headquarters, activePersonnel, budgetInBillions, establishedYear);
        this.numberOfFighterJets = numberOfFighterJets;
        this.mainAircraftType = mainAircraftType;
    }

    public void displayAirForceDetails() {
        displayDefenseDetails();
        System.out.println("---------- Air Force Details ----------");
        System.out.println("Number of Fighter Jets: " + numberOfFighterJets);
        System.out.println("Main Aircraft Type: " + mainAircraftType);
        System.out.println();
    }
}