package allPillerProject;

public abstract class BankAccount {
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public String userName;
	public String bankName;
	public long accNo;
	public double balance;
	public int pin;
	
	public abstract boolean validatePin(int pin);
	public abstract boolean validateAccNo(long accNo);
	public abstract void showDetails(int pin, long accNo);
	public abstract void transfer(double balance);
}
