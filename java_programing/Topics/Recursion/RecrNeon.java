public class RecrNeon {
    public static void main(String[] args) {
        System.out.println("This is Start of the Main Method");
        System.out.print("Enter the number to get the nth Fibbonacy Number:- ");

        int num = new java.util.Scanner(System.in).nextInt();
        int sqr = num * num;
        int sum = RecrSumDig.sumDig(sqr);
        if (sum == num)
            System.out.println("The Given Number " + num + " is Neon Number");
        else
            System.out.println("The Given Number " + num + " is Not Neon Number");

        System.out.println("This is End of the Main Method");
    }
}
