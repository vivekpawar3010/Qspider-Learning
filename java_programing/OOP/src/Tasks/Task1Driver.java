package Tasks;

public class Task1Driver {

	public static void main(String[] args) {
		Task1Interface t1 = new Task1ClassImp(1, 2, 3, 4);
		t1.displayAllAttri();
		t1.displayAttri1();
		t1.displayAttri2();
		t1.displayAttri3();

	}

}
