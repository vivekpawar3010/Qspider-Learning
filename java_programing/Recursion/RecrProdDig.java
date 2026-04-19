
public class RecrProdDig {
    public static void main(String args[]) {
        System.out.println("This is Start of the Main Method");
        System.out.print("Enter the number to get the product of the digits in the given number:- ");

        int num = new java.util.Scanner(System.in).nextInt();
        int pro = productDig(num);
        System.out.println("The Product of Digits present in the " + num + " number is:- " + pro);

        System.out.println("This is End of the Main Method");

    }

    public static int productDig(int num) {
        if (num < 10)
            return num;
        return num % 10 * productDig(num / 10);
    }
}
