package Pillers_java.Inheritance;

class Department extends College {
    String deptName;
    int noOfFaculty;
    int noOfStudents;

    public Department() {
        System.out.println("this is department");
    }

    public Department(String name, String vc, int noOfColleges, String location, String uniCode,
            String principal, String collegeCode, String grade,
            int noOfDepartments, int acRooms,
            String deptName, int noOfFaculty, int noOfStudents) {
        super(deptName, vc, noOfColleges, location, uniCode, principal, collegeCode, grade, noOfDepartments, acRooms);

        this.deptName = deptName;
        this.noOfFaculty = noOfFaculty;
        this.noOfStudents = noOfStudents;
    }

    public void displayDepartment() {
        displayCollege();
        System.out.println("\nDepartment Name : " + deptName);
        System.out.println("Faculty Count   : " + noOfFaculty);
        System.out.println("Student Count   : " + noOfStudents);
    }
}
