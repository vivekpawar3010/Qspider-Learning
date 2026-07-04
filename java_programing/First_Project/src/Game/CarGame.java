package Game;

public class CarGame {
	
	float currFule = 1.5f;
	float maxFule = 15f;
	int speed = 0;
	int maxSpeed = 200;
	float currDistCover = 0;
	int gear = 0;
	int maxGear = 4;
	

	public CarGame() {
		super();
	}


	public CarGame(float currFule, float maxFule, int speed, int maxSpeed, float currDistCover, int maxGear) {
		super();
		this.currFule = currFule;
		this.maxFule = maxFule;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.currDistCover = currDistCover;
		this.maxGear = maxGear;
	}
	
	public void startCar() {
		System.out.println("Car Start");
		screenDisplay();
	}
	public void screenDisplay(){
		System.out.println("Current Speed :- " + speed + " Kmph");
		System.out.println("Fule :- " + currFule + " litter");
		System.out.println("Distance Covered :- " + currDistCover + " Km");
		System.out.println("Current Gear:- " + gear + "/" + maxGear);
	}
	
	public void incrGear() {
		gear++;
		
		System.out.println("Gear Increased  " + gear);
	}
	
	public void increseSpeed(int maxSpeed) {
		if(gear == 0) {
			System.out.println("Increase the Gear First");
			System.out.println("Car is In Nuetral Mode");
			return;
		}
		
		for(int i = 0; i <= maxSpeed; i += gear) {
//			screenDisplay();
			speed = i;
		}
		screenDisplay();
	}
	
	public void turnRight() {
		System.out.println("Turing Right Side ");
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
//		screenDisplay();
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void turnLeft() {
		System.out.println("Turing Left Side ");
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
//		screenDisplay();
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void booster() {
		System.out.println("Going Forward with --- ");
		screenDisplay();
	}
	
	public void reverseGear() {
		System.out.println("Going Backward with --- ");
		screenDisplay();
	}
	
	public void applyBreak(int time, int presure) {
		speed -= (time * presure);
		if(speed < 0) speed = 0;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		screenDisplay();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void reFule(float liter) {
		if(currFule + liter >= maxFule) {
			float remFule = (currFule + liter) - maxFule;
			currFule = maxFule;
			System.out.println("The remaing fule in the barrel is " + remFule + " liters");
			System.out.println("Suggest to keep it in the car Trunk");
		}
	}
	
	
	
	
	
	
}
