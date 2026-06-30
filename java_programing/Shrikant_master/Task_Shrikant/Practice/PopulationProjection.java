package program11;

public class PopulationProjection {
    public static void main(String[] args) {
        System.out.println("Enter the current population of the town:");
        int population = new java.util.Scanner(System.in).nextInt();

        final int SECOND = (365 * 24 * 60 * 60) * 5;
        final int BIRTH = SECOND / 7; // 1 birth every 7 second
        final int DEATH = SECOND / 13; // 1 death every 13 second
        final int IMMIGRATION = SECOND / 45; // 1 immigrant every 45 second

        int netIncrease = population + BIRTH - DEATH + IMMIGRATION;

        System.out.println("The projected population after one year is: " + (population + netIncrease));
    }
}
