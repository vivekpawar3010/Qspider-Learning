package src;
public class ThisPerson {
    String name;
    int age;
    double weight;
    double height;
    String gender;

    public void displayName(String nickname) {
        String name = nickname;
        System.out.println("Official name:- " + this.name);
        System.out.println("Nick name:- " + name);
    }

    public void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
        System.out.println("Weight:- " + weight);
        System.out.println("Height:- " + height);
        System.out.println("Gender:- " + gender);

    }
}