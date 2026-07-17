package Tasks;

public class Task1ClassImp implements Task1Interface{

	private int attri1, attri2, attri3, attri4;
	public Task1ClassImp(int attri1, int attri2, int attri3, int attri4) {
		this.attri1 = attri1;
		this.attri2 = attri2;
		this.attri3 = attri3;
		this.attri4 = attri4;
	}
	
	public void displayAllAttri() {
		System.out.println("Attribue 1 is - " + attri1);
		System.out.println("Attribue 2 is - " + attri2);
		System.out.println("Attribue 3 is - " + attri3);
		System.out.println("Attribue 4 is - " + attri4);
	}
	public void displayAttri1() {
		System.out.println("Attribue 1 is - " + attri1);
	}
	public void displayAttri2() {
		System.out.println("Attribue 2 is - " + attri2);
	}
	public void displayAttri3() {
		System.out.println("Attribue 3 is - " + attri3);
	}

}
