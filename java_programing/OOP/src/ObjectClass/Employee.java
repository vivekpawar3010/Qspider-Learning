package ObjectClass;

import java.util.Objects;

public class Employee {

	String name;
	String id;
	long phoneNo;
	double sal;
	String dept;
	
	public Employee(String name, String id, long phoneNo, double sal, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
		this.sal = sal;
		this.dept = dept;
	}

	public Employee() {}
	
	
	public String toString() {
		return "[ EMP Name:- " + name + ", EMP ID:- " + id + ", Phone no:- " + phoneNo + ", Salary:- " + sal + ", Dept:- " + dept + " ]";
	}
	public int hashCode() {
		return Objects.hash(name, id, phoneNo, sal, dept);
	}
	
	

}
