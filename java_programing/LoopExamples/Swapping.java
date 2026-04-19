package java_programing.LoopExamples;

import java.util.*;

// link of the website:- https://www.efaculty.in/swapping-program-in-java/
public class Swapping {
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Swapping with the 3rd extra number");
        {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 3;
        b = 5;
        System.out.println("Swapping without the 3rd extra number");
        {
            a = a + b; // a now becomes 8
            b = a - b; // b becomes 3 (8 - 5)
            a = a - b; // a becomes 5 (8 - 3)
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 3;
        b = 5;
        System.out.println("Swapping using the bitwise XOR operator");
        {
            a = a ^ b; // a now becomes 6 (3 XOR 5)
            b = a ^ b; // b becomes 3 (6 XOR 5)
            a = a ^ b; // a becomes 5 (6 XOR 3)
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 3;
        b = 5;
        System.out.println("Swapping using the multiplication and division");
        {
            a = a * b; // a now becomes 15
            b = a / b; // b becomes 3 (15 / 5)
            a = a / b; // a becomes 5 (15 / 3)
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
