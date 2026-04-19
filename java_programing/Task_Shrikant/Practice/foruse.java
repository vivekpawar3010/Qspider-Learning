// public class foruse {
//     public static void main(String[] args) {
//         int esum = 0, osum = 0;
//         System.out.print("Enter the value :-");
//         int n = new java.util.Scanner(System.in).nextInt();
//         for (int i = n; i > 0; i /= 10) {
//             int ld = i % 10;
//             if (i % 2 == 0)
//                 esum += ld;
//             else
//                 osum += ld;
//         }
//         System.out.println("The sum of even numbers is " + esum);
//         System.out.println("The sum of odd numbers is " + osum);
//     }
// }

public class foruse {
    public static void main(String[] args) {
        // logic to get prnt the digits in the number in same order
        System.out.print("Enter the value :-");
        int num = new java.util.Scanner(System.in).nextInt();
        int div = 1, len = 0;
        /*
         * coounter logic
         * 1. len = (num + "").length(); // this is also a way to get the length of the
         * number
         * 2. use the one for loop
         * for(int i = num; i > 0; i /= 10) {
         * len++;
         * div *= 10;
         * }
         * div /= 10;
         */
        for (int i = num; i > 0; i /= 10) {
            len++;
        }
        for (int i = 1; i <= len; i++) {
            div *= 10;
        }
        for (int i = num; i != 0; i %= div) {
            div /= 10;
            int fd = i / div;
            System.out.print(fd + "_");
        }

    }
}