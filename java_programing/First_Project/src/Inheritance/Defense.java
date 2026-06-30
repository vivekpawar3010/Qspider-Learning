package Inheritance;

public class Defense {

    String commandName;
    String headquarters;
    int activePersonnel;
    double budgetInBillions;
    int establishedYear;

    public Defense() {
        // Default constructor
    }

    public Defense(String commandName, String headquarters, int activePersonnel, double budgetInBillions,
            int establishedYear) {
        super();
        this.commandName = commandName;
        this.headquarters = headquarters;
        this.activePersonnel = activePersonnel;
        this.budgetInBillions = budgetInBillions;
        this.establishedYear = establishedYear;
    }

    public void displayDefenseDetails() {
        System.out.println("---------- Defense Details ----------");
        System.out.println("Command Name: " + commandName);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Active Personnel: " + activePersonnel);
        System.out.println("Budget: $" + budgetInBillions + " Billion");
        System.out.println("Established Year: " + establishedYear);
    }
}