package Practice;

public class Reationship {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("oppo", 1000, 50, 50);
		Battory b1 =new Battory();
		Mobile m2 =(Mobile) b1;
		m1.A();
		m1.B();
		m1.C();
		m1.D();
		m1.E();
		m2.A();
		m2.B();
		m2.C();
		m2.D();
		m2.E();
//		b1.A();
//		b1.B();
//		b1.C();
//		b1.D();
//		b1.E();
	}
}

class Battory{
	public String name; 
	public double price;
	public int capacity;
	
	public Battory() {
		this("afdad", 1000, 2);
	}
	
	public Battory(String name, double price, int cap) {
		capacity = cap;
		this.name = name;
		this.price = price;
	}
	
	public void A() {System.out.println("Battory - A");}
	public void B() {System.out.println("Battory - B");}
	public void C() {System.out.println("Battory - C");}
	public void display() {
		System.out.println("this is the battory");
		System.out.println("Name" + name);
		System.out.println("price" + price);
		System.out.println("capacity" + capacity);
		
	}
}


class Mobile extends Battory{
	public String name;
	public double price;
	public int pxCamera;
	public double rom;
	
	public Mobile() {
		this("adfasdf", 100, 20, 2);
	}

	public Mobile(String name, double price, int pxCamera, double rom) {
		super();
		this.name = name;
		this.price = price;
		this.pxCamera = pxCamera;
		this.rom = rom;
	}
//	public void A() {System.out.println("Mobile - A");}
//	public void B() {System.out.println("Mobile - B");}
//	public void C() {System.out.println("Mobile - C");}
	public void D() {System.out.println("Mobile - D");}
	public void E() {System.out.println("Mobile - E");}
	
	
	public void display() {
		System.out.println("this is the mobile");
		System.out.println("Name" + name);
		System.out.println("price" + price);
		System.out.println("Camera" + pxCamera);
		System.out.println("rom" + rom);
		super.display();
	}
}