public class DefinedStaticVarHere {
    static int num = 3010;
    static String name = "Rohit";
    static char grade = 'A';
    public static void main(String[] args) {
        System.out.println("This is Start of the Main Method");
        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        demo();
    }   
    static void demo(){
        System.out.println("This is Demo Method");
        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}
