package Test;

public class Driver {
	
	public static void check() {
		int a = 12;
		System.out.println(a + "this is from void check");
	}
	public static int check() {
		int a = 12;
		System.out.println(a + "this from int check");
		return a;
	}
	public static void main(String[] args) {
//		Test t1 = new test2();
//		t1.check();
//		System.out.println(t1.aak);
//		check();
		int b = check();
//		System.out.println(a);
		
		
	}
}


