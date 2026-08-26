import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] ip1 = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(ip1)));
        int[] ip2 = { 1, 2, 3, 9, 9, 9, 9 };
        System.out.println(Arrays.toString(plusOne(ip2)));
        int[] ip3 = { 9, 9, 9, 9, 9, 9 };
        System.out.println(Arrays.toString(plusOne(ip3)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 0)
            return new int[] {};
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        System.out.println(Arrays.toString(result));
        result[0] = 1;
        return result;
    }
}