
public class RecrReversNum {
    public static void main(String[] args) {
        System.out.println("This is Start of the Main Method");
        System.out.print("Enter the number to get the nth Fibbonacy Number:- ");

        int num = new java.util.Scanner(System.in).nextInt();
        int ntFibbo = nthFcbonaci(num, 0, 1);
        System.out.println("The number present at  "+num+"  Fibbonaci number are:- " + ntFibbo);


        System.out.println("This is End of the Main Method");
    }

    public static int nthFcbonaci(int num,int n1,int n2){
        if(num == 0) return n1;
        return nthFcbonaci(num--,n2, n1 + n2);
    }
}
