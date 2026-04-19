
public class RecrSumDig {
    public static void main(String args[]) {
        System.out.println("This is Start of the Main Method");
        System.out.print("Enter the number to get the Sum of the digits in the given number:- ");

        int num = new java.util.Scanner(System.in).nextInt();
        int sum = sumDig(num);
        System.out.println("The number of Digits present in the "+num+" number are:- " + sum);

        System.out.println("This is End of the Main Method");

    }
    public static int sumDig(int num){
        if(num < 10) return num;
        return num % 10 + sumDig(num/10);
    }
}
