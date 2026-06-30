package Inheritance;

public class Army extends Defense {

    int numberOfTanks;
    String chiefOfArmy;

    public Army() {
        // Default constructor
    }

    Army(String commandName, String headquarters, int activePersonnel, double budgetInBillions, int establishedYear,
            int numberOfTanks, String chiefOfArmy) {
        super(commandName, headquarters, activePersonnel, budgetInBillions, establishedYear);
        this.numberOfTanks = numberOfTanks;
        this.chiefOfArmy = chiefOfArmy;
    }

    public void displayArmyDetails() {
        displayDefenseDetails();
        System.out.println("---------- Army Details ----------");
        System.out.println("Number of Tanks: " + numberOfTanks);
        System.out.println("Chief of Army: " + chiefOfArmy);
        System.out.println();
    }
}