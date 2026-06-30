
public class RecrCountOfDig {
    public static void main(String args[]) {
        System.out.println("This is Start of the Main Method");
        System.out.print("Enter the number to count the digits in the given number:- ");

        int num = new java.util.Scanner(System.in).nextInt();
        int ct = countDig(num);
        System.out.println("The number of Digits present in the "+num+" number are:- " + ct);

        System.out.println("This is End of the Main Method");

    }
    public static int countDig(int num){
        if(num < 10) return 1;
        return 1 + countDig(num/10);
    }
}
