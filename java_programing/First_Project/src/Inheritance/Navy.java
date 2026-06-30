package Inheritance;

public class Navy extends Defense {

    int numberOfShips;
    int numberOfSubmarines;

    public Navy() {
        // Default constructor
    }

    Navy(String commandName, String headquarters, int activePersonnel, double budgetInBillions, int establishedYear,
            int numberOfShips, int numberOfSubmarines) {
        super(commandName, headquarters, activePersonnel, budgetInBillions, establishedYear);
        this.numberOfShips = numberOfShips;
        this.numberOfSubmarines = numberOfSubmarines;
    }

    public void displayNavyDetails() {
        displayDefenseDetails();
        System.out.println("---------- Navy Details ----------");
        System.out.println("Number of Ships: " + numberOfShips);
        System.out.println("Number of Submarines: " + numberOfSubmarines);
        System.out.println();
    }
}