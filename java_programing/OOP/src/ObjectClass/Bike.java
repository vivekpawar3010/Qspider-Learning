package ObjectClass;

import java.util.Objects;

public class Bike {
	String name;
	String model;
	int number;
	String dist;
	double price;
	public Bike(String name, String model, int number, String dist, double price) {
		super();
		this.name = name;
		this.model = model;
		this.number = number;
		this.dist = dist;
		this.price = price;
	}
	
	public Bike() {}
	
	public String toString() {
		return "[ Name:- " + name + ", Dist- " + dist + ", Model:- " + model + ", Number:- " + number + ", Price:- " + price + " ]";
	}
	
	public boolean equals(Object o) {
		
		if(o == null || !(o instanceof Bike)) return false;
		Bike b1 = (Bike) o;
		if(b1.name == this.name && b1.dist == this.dist && this.model == b1.model && this.price == b1.price && this.number == b1.number) return true;
			
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(name, model, number, dist, price );
	}
	
	public int myhashCode() {
		return Objects.hash(name, dist, price, model, number);
	}
}
