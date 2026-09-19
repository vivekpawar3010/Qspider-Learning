package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class StudentDriver {

	public static void main(String[] args) {

		ArrayList<Student> db = new ArrayList<>();

		db.add(new Student("Raj", 101, "FC College", 65.66));
		db.add(new Student("Rani", 102, "FC College", 75.23));
		db.add(new Student("Mahesh", 103, "Modern College", 89.61));
		db.add(new Student("Kapil", 104, "DY Patil College", 90.56));
		db.add(new Student("Sunny", 105, "COEP College", 89.16));

		db.add(new Student("Amit", 106, "Modern College", 72.45));
		db.add(new Student("Priya", 107, "DY Patil College", 81.32));
		db.add(new Student("Sneha", 108, "FC College", 94.25));
		db.add(new Student("Rohit", 109, "COEP College", 78.64));
		db.add(new Student("Pooja", 110, "MIT-WPU", 86.72));

		db.add(new Student("Akash", 111, "Symbiosis College", 69.83));
		db.add(new Student("Neha", 112, "FC College", 91.45));
		db.add(new Student("Vikas", 113, "Modern College", 74.29));
		db.add(new Student("Priyanka", 114, "DY Patil College", 88.91));
		db.add(new Student("Sagar", 115, "COEP College", 82.37));

		db.add(new Student("Komal", 116, "MIT-WPU", 95.12));
		db.add(new Student("Nikhil", 117, "Symbiosis College", 76.58));
		db.add(new Student("Anjali", 118, "FC College", 84.63));
		db.add(new Student("Rahul", 119, "Modern College", 67.94));
		db.add(new Student("Snehal", 120, "DY Patil College", 92.48));

		db.add(new Student("Kiran", 121, "COEP College", 79.35));
		db.add(new Student("Meena", 122, "MIT-WPU", 87.26));
		db.add(new Student("Pratik", 123, "Symbiosis College", 73.81));
		db.add(new Student("Swati", 124, "FC College", 90.14));
		db.add(new Student("Ganesh", 125, "Modern College", 66.72));

		db.add(new Student("Vaishnavi", 126, "DY Patil College", 83.59));
		db.add(new Student("Sachin", 127, "COEP College", 71.46));
		db.add(new Student("Kajal", 128, "MIT-WPU", 89.73));
		db.add(new Student("Tejas", 129, "Symbiosis College", 77.65));
		db.add(new Student("Shubham", 130, "FC College", 93.21));

		db.add(new Student("Rutuja", 131, "Modern College", 85.47));
		db.add(new Student("Abhishek", 132, "DY Patil College", 68.39));
		db.add(new Student("Madhuri", 133, "COEP College", 91.76));
		db.add(new Student("Omkar", 134, "MIT-WPU", 74.82));
		db.add(new Student("Sonali", 135, "Symbiosis College", 88.34));

		db.add(new Student("Yash", 136, "FC College", 79.91));
		db.add(new Student("Monika", 137, "Modern College", 96.25));
		db.add(new Student("Siddharth", 138, "DY Patil College", 82.63));
		db.add(new Student("Isha", 139, "COEP College", 70.48));
		db.add(new Student("Amol", 140, "MIT-WPU", 87.59));

		db.add(new Student("Aarti", 141, "Symbiosis College", 92.17));
		db.add(new Student("Vishal", 142, "FC College", 73.46));
		db.add(new Student("Manisha", 143, "Modern College", 84.72));
		db.add(new Student("Rakesh", 144, "DY Patil College", 69.58));
		db.add(new Student("Divya", 145, "COEP College", 90.83));

		db.add(new Student("Atul", 146, "MIT-WPU", 76.29));
		db.add(new Student("Shruti", 147, "Symbiosis College", 85.64));
		db.add(new Student("Chetan", 148, "FC College", 81.37));
		db.add(new Student("Pallavi", 149, "Modern College", 94.51));
		db.add(new Student("Nitin", 150, "DY Patil College", 72.86));

		System.out.println(String.format("%-12s %-8s %-25s %6s", "Name", "RollNo", "College", "Marks"));

		System.out.println("---------------------------------------------------------------");

		for (Student s : db) {
			System.out.print(s);
		}

		// 1) Find the Student with the max marks

		System.out.println("-------------------| Max Marks Student |-----------------");

		Student maxMarksStudent = maxMarksStudentIs(db);

		System.out.println(maxMarksStudent);

		// 2) Students Name ends with the str = esh

		System.out.println("-------------------| Students name End with str=esh |-----------------");

		ArrayList<Student> studentsEndWithStr = listOfStudentsEndWithStr(db, "esh");

		System.out.println(String.format("%-12s %-8s %-25s %6s", "Name", "RollNo", "College", "Marks"));

		System.out.println("---------------------------------------------------------------");

		for (Student s : studentsEndWithStr) {
			System.out.print(s);
		}

		// 3) Students college present in clg = "FC College"

		System.out.println("-------------------| Students From the College clg=\"FC College\" |-----------------");

		ArrayList<Student> studentsFromClg = listOfStudentsFromCollege(db, "FC College");

		System.out.println(String.format("%-12s %-8s %-25s %6s", "Name", "RollNo", "College", "Marks"));

		System.out.println("---------------------------------------------------------------");

		for (Student s : studentsFromClg) {
			System.out.print(s);
		}

		// 4) Remove all the student belong to clg = "Modern College"

		System.out.println(
				"-------------------| Students Not From the College clg=\"Modern College\" |-----------------");

		ArrayList<Student> studentsNotFromClg = listOfStudentsNotFromCollege(db, "Modern College");

		System.out.println(String.format("%-12s %-8s %-25s %6s", "Name", "RollNo", "College", "Marks"));

		System.out.println("---------------------------------------------------------------");

		for (Student s : studentsNotFromClg) {
			System.out.print(s);
		}

		// 5) Check the Student name="Ramesh" and he belong to clg="FC College" or not

		System.out.println(
				"-------------------| Is the Student name=\"Ramesh\" From the College clg=\"Modern College\" |-----------------");

		String stdName = "Ramesh";
		String stdClg = "Modern College";

		boolean studentBelongToClg = isStudentBelongToClg(db, stdName, stdClg);

		System.out.println((studentBelongToClg ? "Yes" : "No") + " Student name:" + stdName
				+ (studentBelongToClg ? " is" : " is Not") + " Belong to the College:" + stdClg);

		// 6) Find the student with the secondMax marks

		System.out.println("-------------------| Second Max Marks Student |-----------------");

		Student secondMaxMarksStudent = secondMaxMarksStudentIs(db);

		System.out.println(secondMaxMarksStudent);

		// 7) Sort the List based on the Marks

		System.out.println("-------------------| Students Sorted Based On Marks |-----------------");

		ArrayList<Student> sortedStudents = sortOnMarks(db);

		System.out.println(String.format("%-12s %-8s %-25s %6s", "Name", "RollNo", "College", "Marks"));

		System.out.println("---------------------------------------------------------------");

		for (Student s : sortedStudents) {
			System.out.print(s);
		}

	}

	// methods

	// 1) Find the Student with the max marks
	public static Student maxMarksStudentIs(ArrayList<Student> db) {

		Student std = null;

		double max = 0;

		ListIterator<Student> lt = db.listIterator();

		while (lt.hasNext()) {

			Student temp = lt.next();

			if (temp.marks > max) {

				max = temp.marks;

				std = temp;
			}
		}

		return std;
	}

	// 2) Students Name ends with the str = esh
	public static ArrayList<Student> listOfStudentsEndWithStr(ArrayList<Student> db, String str) {

		ArrayList<Student> list = new ArrayList<Student>();

		int n = str.length();

		ListIterator<Student> lt = db.listIterator();

		while (lt.hasNext()) {

			Student temp = lt.next();

			if (temp.name.length() < n)
				continue;

			if (temp.name.substring(temp.name.length() - n).equals(str)) {

				list.add(temp);
			}
		}

		return list;
	}

	// 3) Students college present in clg = "FC College"
	public static ArrayList<Student> listOfStudentsFromCollege(ArrayList<Student> db, String college) {

		ArrayList<Student> list = new ArrayList<Student>();

		ListIterator<Student> lt = db.listIterator();

		while (lt.hasNext()) {

			Student temp = lt.next();

			if (temp.clg.equals(college)) {

				list.add(temp);
			}
		}

		return list;
	}

	// 4) Remove all the student belong to clg = "Modern College"
	public static ArrayList<Student> listOfStudentsNotFromCollege(ArrayList<Student> db, String college) {

		ArrayList<Student> list = new ArrayList<Student>(db);

		ListIterator<Student> lt = list.listIterator();

		while (lt.hasNext()) {

			Student temp = lt.next();

			if (temp.clg.equals(college)) {

				lt.remove();
			}
		}

		return list;
	}

	// 5) Check the Student name="Ramesh" and he belong to clg="FC College" or not
	public static boolean isStudentBelongToClg(ArrayList<Student> db, String name, String college) {

		ListIterator<Student> lt = db.listIterator();

		while (lt.hasNext()) {

			Student temp = lt.next();

			if (temp.name.equals(name)) {

				return temp.clg.equals(college);
			}
		}

		return false;
	}

	// 6) Find the studnet with the secondMax marks
	public static Student secondMaxMarksStudentIs(ArrayList<Student> db) {

		Student std1 = null;
		Student std2 = null;

		double max = Double.MIN_VALUE;
		double smax = Double.MIN_VALUE;

		ListIterator<Student> lt = db.listIterator();

		while (lt.hasNext()) {

			Student temp = lt.next();

			if (temp.marks > max) {

				smax = max;
				std2 = std1;

				max = temp.marks;
				std1 = temp;

			} else if (temp.marks > smax && temp.marks < max) {

				smax = temp.marks;
				std2 = temp;
			}
		}

		return std2;
	}

	// 7) Sort the List based on the Marks
	public static ArrayList<Student> sortOnMarks(ArrayList<Student> db) {

		ArrayList<Student> list = new ArrayList<Student>(db);

		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = 0; j < list.size() - 1 - i; j++) {

				if (list.get(j).marks > list.get(j + 1).marks) {

					Student temp = list.get(j);

					list.set(j, list.get(j + 1));

					list.set(j + 1, temp);
				}
			}
		}

		return list;
	}

}