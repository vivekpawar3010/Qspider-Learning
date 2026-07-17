// package Arrays;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {
        char[] a = new char[5];
        System.out.println(Arrays.toString(a));

        a[0] = 'a';
        a[1] = 'e';
        a[2] = 'o';
        a[3] = 'i';
        a[4] = 'u';
        System.out.println(Arrays.toString(a));

        String[] great = new String[-1];
        System.out.println(Arrays.toString(great));
        great[0] = "hi";
        great[1] = "hello";
        great[2] = "nice";
        System.out.println(Arrays.toString(great));

    }
}