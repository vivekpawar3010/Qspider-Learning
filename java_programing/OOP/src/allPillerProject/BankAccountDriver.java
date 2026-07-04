package allPillerProject;

public class BankAccountDriver {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccountImpl("Vivek", "BOB", 12345678l, 1234, 12343.3);
		
		b1.showDetails(1234, 12345678l);

	}

}
