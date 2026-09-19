package ArrayListPrograms;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	public String name;
	public int rollNo;
	public String clg;
	public double marks;
	
	public Student() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You created an empty object so fill the below information");
		System.out.print("Enter the Student Name:- ");
		name = sc.nextLine();
		
		System.out.print("Enter the Student Age :- ");
		rollNo = sc.nextInt();

		System.out.print("Enter the Student College name:- ");
		clg = sc.nextLine();
		
		System.out.print("Enter the Student College name:- ");
		marks = sc.nextDouble();
		System.out.println("\n  Thank You for filling the information \n");
	}

	
	public Student(String name, int age, String clg, double marks) {
		super();
		this.name = name;
		this.rollNo = age;
		this.clg = clg;
		this.marks = marks;
	}


	@Override
	public String toString() {
	    return String.format(
	        "%-12s %-8d %-25s %6.2f%n",
	        name, rollNo, clg, marks
	    );
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo, clg, marks, name);
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		
		if(obj instanceof Student) {
			Student s1 = (Student) obj;
			return s1.rollNo == this.rollNo && s1.name.equals(this.name) && s1.clg.equals(this.clg) && this.marks == s1.marks;
		}

		return false;
	}
	
	
	
}
