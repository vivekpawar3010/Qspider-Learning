// public class LoopEx {
//     public static void main(String[] args) {
//         System.out.print("Enter the value to get the table: -");
//         for (int i = 1, n = new java.util.Scanner(System.in).nextInt(); i < 10; i++) {
//             System.out.println(i + " X " + n + " = " + i * n);
//         }
//     }
// }

public class LoopEx {
    public static void main(String[] args) {
        for (char l = 'a', u = 'A'; l <= 'z' && u <= 'Z'; l++, u++) {
            System.out.print(l + "" + u + "  ");
            System.out.print(l + "" + u + "  ");
        }
    }
}

// public class LoopEx {
// public static void main(String[] args) {
// int i = 0; // initialization
// do {
// System.out.println(i);
// i++; // updation
// } while (i < 10); // condition
// }
// }