package Pillers_java.Inheritance;

class College extends University {
    String principal;
    String collegeCode;
    String grade;
    int noOfDepartments;
    int acRooms;

    public College() {
        System.out.println("this is college");
    }

    public College(String name, String vc, int noOfColleges, String location, String uniCode,
            String principal, String collegeCode, String grade,
            int noOfDepartments, int acRooms) {
        super(name, vc, noOfColleges, location, uniCode);

        this.principal = principal;
        this.collegeCode = collegeCode;
        this.grade = grade;
        this.noOfDepartments = noOfDepartments;
        this.acRooms = acRooms;
    }

    public void displayCollege() {
        displayUniversity();
        System.out.println("\nPrincipal       : " + principal);
        System.out.println("College Code    : " + collegeCode);
        System.out.println("Grade           : " + grade);
        System.out.println("No Of Dept      : " + noOfDepartments);
        System.out.println("AC Rooms        : " + acRooms);
    }
}
