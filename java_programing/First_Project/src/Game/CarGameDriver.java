package Game;

public class CarGameDriver {
	public static void main(String[] args) {
		CarGame fast = new CarGame(2, 15, 0, 300, 12, 6);
		
		fast.startCar();
		System.out.println("----------------------------------------------");
		fast.increseSpeed(50);
		System.out.println("----------------------------------------------");
		fast.incrGear();
		System.out.println("----------------------------------------------");
		fast.increseSpeed(50);
		System.out.println("----------------------------------------------");
		
		System.out.println("----------------------------------------------");
		
	}
}
