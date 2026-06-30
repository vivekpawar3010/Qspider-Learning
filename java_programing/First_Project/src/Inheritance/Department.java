package Inheritance;

class Department extends College {
    String deptName;
    int noOfFaculty;
    int noOfStudents;

    public Department(String name, String vc, int noOfColleges, String location, String uniCode,
            String principal, String collegeCode, String grade,
            int noOfDepartments, int acRooms,
            String deptName, int noOfFaculty, int noOfStudents) {
        this.name = name;
        this.vc = vc;
        this.noOfColleges = noOfColleges;
        this.location = location;
        this.uniCode = uniCode;

        this.principal = principal;
        this.collegeCode = collegeCode;
        this.grade = grade;
        this.noOfDepartments = noOfDepartments;
        this.acRooms = acRooms;

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
