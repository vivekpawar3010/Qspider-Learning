package Tasks;
import java.util.Scanner;
public class BankImp implements Bank{
	private int pin;
	private long accNo;
	private double balance;
	public BankImp(int pin, long accNo, double balance) {
		super();
		this.pin = pin;
		this.accNo = accNo;
		this.balance = balance;
	}
	public void withdraw() {
		System.out.println("To withdraw the money First Enter Account No and PIN");
		toAcceptAccNoPin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount to withdraw:- ");
		double useramount = sc.nextDouble();
		if(useramount < 0 ) System.out.println("use amount to withdraw is wrong");
		else if(useramount > balance) System.out.println("use amount to withdraw is more than balance");
		else {
			balance -= useramount;
			System.out.println("Your Amount " + useramount + " is withdraw success fully");
			System.out.println("Your Amount remainning in the account is " + balance);
		}
		
	}
	public void deposit() {
		System.out.println("To deposite the money First Enter Account No and PIN");
		toAcceptAccNoPin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount to deposit:- ");
		double useramount = sc.nextDouble();
		if(useramount < 0 ) System.out.println("use amount to deposit is wrong");
		else {
			balance += useramount;
			System.out.println("Your Amount " + useramount + " is depoite success fully");
			System.out.println("Your Amount remainning in the account is " + balance);
		}
	}
	public void checkBalance() {
		toAcceptAccNoPin();
		System.out.println("Your Amount remainning in the account is " + balance);
	}
	public void toAcceptAccNoPin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Number:- ");
		long userAcc = sc.nextLong();
		System.out.print("Enter the Pin Number:- ");
		int userPin = sc.nextInt();
		if(userAcc == accNo && userPin == pin) {
			System.out.println("Your Account No and Pin is Correct");
		}else {
			System.out.println("Your Account No and Pin is Incorrect");
			toAcceptAccNoPin();
		}
	}

}
