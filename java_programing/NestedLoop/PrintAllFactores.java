package java_programing.NestedLoop;

import java.util.*;

public class PrintAllFactores {
    public static void main(String[] args) {
        int start = new Scanner(System.in).nextInt();
        int end = new Scanner(System.in).nextInt();
        while (start <= end) {
            System.out.print("The list of factors for number " + start + " are => ");
            for (int i = 1; i < start / 2; i++) {
                if (start % i == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println(start);
            start++;
        }
    }
}
