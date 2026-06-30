package src;
public class ThisPersonDriver1 {

    public static void main(String[] args) {
        ThisPerson p1 = new ThisPerson();
        p1.age = 22;
        p1.gender = "Male";
        p1.height = 6.2;
        p1.name = "Vivek Pawar";
        p1.weight = 70;
        p1.displayName("Pawar");
        p1.displayDetails();

        ThisPerson p2 = new ThisPerson();
        p2.age = 22;
        p2.gender = "Male";
        p2.height = 6.2;
        p2.name = "King Pawar";
        p2.weight = 70;
        p2.displayName("King");
        p2.displayDetails();
    }
}