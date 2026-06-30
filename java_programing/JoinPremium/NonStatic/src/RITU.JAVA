public class RITU{
    static int a = add(12);
    static{
        int a = 23;
        a = a + add(a);
    }
    public static void main(String[] args){
        System.out.println("this is ,main");
    }

    public static int add(int add){
        System.out.println(a);
        System.out.println("no adsfas int ");
        return 4;

    }

}
