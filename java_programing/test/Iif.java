public class Iif {
    public static void main(String[] args) {
        boolean ok;
        if (ok = true) { 
            // it is boolean trap in java, here we are using assignment operator instead of equality operator, so instead of comparing ok with true, we are assigning true to ok, which will always evaluate to true
            // Here we are assigning true to ok, which will always evaluate to true
            System.out.println("ok is true");
        } else {
            System.out.println("ok is false");
        }
        int a = 11;
    //     try{
    //     if (a = 10) {   
    //         // This will cause a compilation error because we cannot assign an int to a boolean
    //         // Here we are assigning 10 to a, which will always evaluate to true
    //         // int if condtion 10 value is not boolean, so it will cause a compilation error
    //         System.out.println("ok is true");
    //     } else {
    //         System.out.println("ok is false");
    //     }
    // }    catch(Exception e){
    //     System.out.println("This is an error: " + e.getMessage());
    //     System.out.println("// This will cause a compilation error because we cannot assign an int to a boolean \n // Here we are assigning 10 to a, which will always evaluate to true \n // int if condtion 10 value is not boolean, so it will cause a compilation error");
    // }

    }
    
}