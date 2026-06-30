package Task_Shrikant.Practice;

import java.util.Scanner;

public class ForAssignment {
    // all re the scanner inputs no shortcut all
    public static void main(String[] args) {

        // * 1. input 1234 output 4321
        int num1 = new Scanner(System.in).nextInt();

        int rev = 0;
        for(int i = num1; i > 0; i /= 10){
            int ld = i % 10;
            rev = rev * 10 + ld;
        }
        System.out.println(rev);

        // * 2. input 1234 output coutn of the digits length
        int num2 = new Scanner(System.in).nextInt();
        int len = 0;
        for(int i = num2; i > 0; i /= 10){
            len++;
        }
        System.out.println(len);

        // * 3. sum of digits
        int num3 = new Scanner(System.in).nextInt();
        int sum = 0;
        for(int i = num3; i > 0; i /= 10){
            int ld = i % 10;
            sum += ld;
        }
        System.out.println(sum);
        // * 4. sum of the even and odd digits separately
        int num4 = new Scanner(System.in).nextInt();
        int esum = 0, osum = 0; 
        for(int i = num4; i > 0; i /= 10){
            int ld = i % 10;
            if(i % 2 == 0){
                esum += ld;
            } else {
                osum += ld;
            }
        }
        System.out.println(esum);
        System.out.println(osum);

        // * 5. avg of the digits
        int num5 = new Scanner(System.in).nextInt();
        int avg = 0;
        for(int i = num5; i > 0; i /= 10){
            int ld = i % 10;
            avg += ld;
        }
        System.out.println(avg / len);

        // * 6. avg of the even and odd digits separately
        int num6 = new Scanner(System.in).nextInt();    
        int esum6 = 0, osum6 = 0,ecount = 0, ocount = 0;
        for(int i = num6; i > 0; i /= 10){
            int ld = i % 10;
            if(i % 2 == 0){
                esum6 += ld;
                ecount++;
            } else {
                osum6 += ld;
                ocount++;
            }
        }
        System.out.println(esum6 / ecount);
        System.out.println(osum6 / ocount); 
        // * 7. producto the digits
        int num7 = new Scanner(System.in).nextInt();
        int prod = 1;       
        for(int i = num7; i > 0; i /= 10){
            int ld = i % 10;
            prod *= ld;
        }
        System.out.println(prod);
        // * 8. create the divisor based on the length
        // * eg inpupt | divisor | output
        // * 1234 | 1000 | 4321
        // * 12 100 | 21
        // * 1
        int num8 = new Scanner(System.in).nextInt();
        int div = 1, len8 = 0;
        for (int i = num8; i > 0; i /= 10) {
            len8++;
        }
        for (int i = 1; i <= len8; i++) {
            div *= 10;
        }
        for (int i = num8; i != 0; i %= div) {
            div /= 10;
            int fd = i / div;
            System.out.print(fd + "_"); 
        }
        
        // * 9. inupt 1234 output 1_2_3_4_
        int num9 = new Scanner(System.in).nextInt();
        int div9 = 1, len9 = 0;
        for (int i = num9; i > 0; i /= 10) {
            len9++;
        }
        for (int i = 1; i <= len9; i++) {
            div9 *= 10;
        }   
        for (int i = num9; i != 0; i %= div9) {
            div9 /= 10;
            int fd = i / div9;
            System.out.print(fd + "_");
        }
        // * 10. number to words
        int num10 = new Scanner(System.in).nextInt();
        String words = "";
        for(int i = num10; i > 0; i /= 10){
            int ld = i % 10;
            String word = switch (ld) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "";
            };
            words = word + " " + words;
        }
        System.out.println(words)

            
    }

}
