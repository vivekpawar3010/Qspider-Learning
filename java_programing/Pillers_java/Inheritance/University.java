package Pillers_java.Inheritance;

class University {
    String name;
    String vc;
    int noOfColleges;
    String location;
    String uniCode;

    public University() {
    }

    public University(String name, String vc, int noOfColleges, String location, String uniCode) {
        super();
        this.name = name;
        this.vc = vc;
        this.noOfColleges = noOfColleges;
        this.location = location;
        this.uniCode = uniCode;
        System.out.println("this is university");
    }

    public void displayUniversity() {
        System.out.println("University Name : " + name);
        System.out.println("Vice Chancellor : " + vc);
        System.out.println("No Of Colleges  : " + noOfColleges);
        System.out.println("Location        : " + location);
        System.out.println("University Code : " + uniCode);
    }
}