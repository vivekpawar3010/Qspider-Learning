package src;
public class Raju {
    String surname = "kaju";
    static String favfood = "Laddu";

    static {
        Raju r1 = new Raju();
        System.out.println("form the static rajju -- " + r1);
        System.out.println("fav food " + favfood);
        favfood = "maggi";
        System.out.println("fav food " + favfood);
        System.out.println(r1.surname);
    }
}
