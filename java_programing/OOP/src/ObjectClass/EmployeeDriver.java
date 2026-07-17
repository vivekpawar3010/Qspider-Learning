package ObjectClass;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee chatya = new Employee("Chaitanya" , "Insys_01", 98904665423l, 70000000.0, "IT");
		Employee chatya1 = new Employee("Chaitanya" , "Insys_01", 98904665423l, 70000000.0, "IT");
		
		System.out.println(chatya.hashCode());
		System.out.println(chatya1.hashCode());
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
