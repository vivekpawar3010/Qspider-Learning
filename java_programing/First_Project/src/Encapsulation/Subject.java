package Pillers_java.Encapsulation;

public class Subject {
    String subName;
    String subID;
    String deptNo;

    private Subject() {

    }

    public Subject(String subName, String subID, String deptNo) {
        this.deptNo = deptNo;
        this.subID = subID;
        this.subName = subName;
    }

    public void showSubjectDetilsById(String subId) {
        System.out.println("Subject ID - " + subId);
        System.out.println("Subject Name - " + subName);
        System.out.println("Subject Dept No - " + deptNo);
    }

    public void showSubjectDetilsByName(String subName) {
        System.out.println("Subject ID - " + subID);
        System.out.println("Subject Name - " + subName);
        System.out.println("Subject Dept No - " + deptNo);
    }
}
