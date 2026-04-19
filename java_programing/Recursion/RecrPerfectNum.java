public class RecrPerfectNum {
    public static void main(String[] args) {
        System.out.println(sumOfDivisor(4, 2));
    }
    public static int sumOfDivisor(int n, int str){

        if (str < n / 2) {
            if (n % str == 0) {
                return str + sumOfDivisor(n, ++str);
            }
        }
        return sumOfDivisor(n, ++str);
        // return (n % str == 0? str:0) + sumOfDivisor(n, ++str);
    }
}
