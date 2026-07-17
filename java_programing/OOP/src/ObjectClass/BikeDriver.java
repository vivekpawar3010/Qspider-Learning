package ObjectClass;

public class BikeDriver {

	public static void main(String[] args) {
		
		Bike xplus = new Bike("Xplus", "210", 3639, "Solapur", 210000.00);
		Bike xplus2 = new Bike("Xplus", "210", 3639, "Solapur", 210000.00);
		
		System.out.println(xplus);
		System.out.println(xplus2);
		System.out.println(xplus.equals(xplus2));
		System.out.println(xplus.hashCode());
		System.out.println(xplus2.myhashCode());
		System.out.println(Math.sqrt(25));
		
	}
	

}
