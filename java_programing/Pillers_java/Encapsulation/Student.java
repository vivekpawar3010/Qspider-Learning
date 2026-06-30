package Pillers_java.Encapsulation;

public class Student {

    private String stdName;
    private String stdID;
    private String emailId;
    private long mobileNo;
    private String clgName;
    private String deptName;
    private String className;
    private int noOfSubjects;
    private String location;

    private Student() {

    }

    // For new Student
    public Student(String stdName, String emailId, long mobileNo, String clgName, String deptName, String className,
            String location, int noOfSubjects) {

    }

    private boolean validateEmailId(String emailId) {
        int elen = emailId.length();
        if (elen == 0)
            return false;
        int idxarate = -1;
        int idxdot = -1;
        for (int i = 0; i < elen; i++) {
            if (emailId.charAt(i) == '@')
                idxarate = i;
            else if (emailId.charAt(i) == '.')
                idxdot = i;
        }

    }

}