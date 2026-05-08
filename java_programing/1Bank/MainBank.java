import java.util.Scanner;

public class MainBank {
    static double balance;
    static int[] accNum = new int[1000];

    public static void main(String[] args) {
        System.out.println("------------------------- Welcome to King Bank ---------------------");
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Give me the Your Choise");
            
            int choise = sc.nextInt();

        }
    }

    public static void checkBalance() {
        System.out.println("Your Avalable Balance is - " + balance);
    }

    public static void withdraw(int amt) {
        if (amt > 0 && balance - amt >= 2000.0) {
            balance -= amt;
            System.out.println("Amount of " + amt + " has been debited.");
            System.out.println("The current balance in the bank account is -" + balance);
        } else {
            System.out.println((amt > 0) ? "The Bank Account have insufficient funds" : "Invalid balance" + balance);
        }
    }

    public static void deposit(int amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("The amount of " + amt + "has been credited to your account");
            System.out.println("Your current balance is - " + balance);
        } else {
            System.out.println("The credited amount is invalid");
        }
    }

}