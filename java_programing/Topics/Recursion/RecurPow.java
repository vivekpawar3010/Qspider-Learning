public class RecurPow {
    public static void main(String[] args) {
        System.out.println("===========> Main Method Start <===============");

        System.out.print("Enter the Nubmers to get the base power of raise");
        try{
            int base = new java.util.Scanner(System.in).nextInt();
            int raise = new java.util.Scanner(System.in).nextInt();
            int ans = powBR(base, raise);
            System.out.println("The Given Number base"+ base + "Raise to " + raise + " and is " + ans);
        }catch(StackOverflowError e){
            System.err.println("\n**************************************************");
            System.err.println("*                                                *");
            System.err.println("*        CRITICAL ERROR: STACK OVERFLOW          *");
            System.err.println("*    Recursion depth exceeded memory limits!     *");
            System.err.println("*                                                *");
            System.err.println("**************************************************");
        
        }



        System.out.println("xxxxxxxxxxxxxxxx> Main Method End <xxxxxxxxxxxxxxxxxxxx");

    }
    public static int powBR(int base, int raise) {
        if(raise == 1) return base;
        return base * powBR(base, raise - 1);
    }
}

