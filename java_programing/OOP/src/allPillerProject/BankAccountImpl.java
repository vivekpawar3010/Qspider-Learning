package allPillerProject;

import java.util.Scanner;

public class BankAccountImpl extends BankAccount{
	
	
	
	BankAccountImpl() {
		super();
	}
	public BankAccountImpl(String userName, String bankName, long accNo, int pin, double balance) {
		this.userName = userName;
		this.bankName = bankName;
		this.accNo = validateAccNoAtCreation(accNo);
		this.pin = validatePinAtCreation(pin);
		this.balance = validateBalanceAtCreation(balance);
	}
	
	public long validateAccNoAtCreation(long accNo) {
		if(length(accNo) != 8) {
			System.out.print("Enter 8 Digit account number :- ");
			long newAccNo = new Scanner(System.in).nextLong();
			return validateAccNoAtCreation(newAccNo);
		}
		return accNo;
	}
	
	public int validatePinAtCreation(int pin) {
		if(length(pin) != 4) {
			System.out.print("Enter 8 Digit account number :- ");
			int newPin = new Scanner(System.in).nextInt();
			return validatePinAtCreation(newPin);
		}
		return pin;
	}
	public double validateBalanceAtCreation(double accNo) {
		if(accNo < 0) {
			System.out.print("Enter Positive value");
			double newBal = new Scanner(System.in).nextDouble();
			return validateBalanceAtCreation(newBal);
		}
		return accNo;
	}

	public boolean validatePin(int pin) {
		if(length(pin) != 4) {
			System.out.println("Your pin number is Not in format");
			return false;
		}
		if(pin == this.pin) {
			System.out.println("Your Pin is correct");
			return true;
		}
		return false;
	}
	
	public boolean validateAccNo(long accNo) {
		if(length(accNo) != 8) {
				System.out.println("Your account number is Not in format");
				return false;
		}
		if(accNo == this.accNo) {
			System.out.println("Your acc is right");
			return true;
		}
		return false;
	}
	 
	public void showDetails(int pin, long accNo) {
		if(!(validateAccNo(accNo) && validatePin(pin))) {
			System.out.println("Your account Number or pin is wrong");
			return ;
		}
		System.out.println("The Bank Details of user: ");
		System.out.println("User Name:- " + userName);
		System.out.println("Bank Name:- " + bankName);
		System.out.println("Account Number" + accNo);
		System.out.println("Current Balance In the Account is :-" + balance);
		
	}
	public void transfer(double amt) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account Nubmer");
		long accNo = sc.nextLong();
		System.out.print("Enter the account Nubmer");
		int pin = sc.nextInt();
		System.out.println("Processing....");
		if(!(validateAccNo(accNo) && validatePin(pin))) {
			System.out.println("Your Pin or account Number is Wrong");
			return;
		}
		if(balance - amt > 0 ) {
			balance -= amt;
			showDetails(pin, accNo);
		}else {
			System.out.println("You Don't have the sufficient fund to transfer the amount");
			return;
		}
		
		
	}
	public int length(long num) {
		int len = 0;
		while(num > 0) {
			len++;
			num /= 10;
		}
		return len;
	}
	
}
