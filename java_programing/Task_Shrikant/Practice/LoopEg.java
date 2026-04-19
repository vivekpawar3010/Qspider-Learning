// // public class LoopEg {
// //     public static void main(String[] args) {
// //         int i = 1;
// //         System.out.println("Loop start");
// //         for (System.out.println(i + "  initalizaion"); i <= 4; System.out.println(i + "  Updation")) {
// //             System.out.println(i + "  Condtion check");
// //             System.out.println(i + "  Loop exicution");
// //             i++;
// //             System.err.println();
// //         }
// //         System.out.println("Loop Ends");
// //     }
// // }

// public class LoopEg {

//     public static void main(String[] args) {
//         // ascii and odd

//         // 1. ascii value of a is 97
//         for (char i = 'A'; i <= 'Z'; i++) {
//             System.out.print(i + "-" + (int) i + "  ");
//         }
//         System.out.println();
//         // 2. odd number
//         System.out.print("Enter the start to get the odd number: -");
//         int str = new java.util.Scanner(System.in).nextInt();
//         System.out.print("Enter the end to get the odd number: -");
//         int end = new java.util.Scanner(System.in).nextInt();
//         for (int i = str; i <= end; i++) {
//             if (i % 2 != 0) {
//                 System.out.print(i + "  ");
//             }
//         }
//     }
// }

// public class LoopEg {
//     public static void main(String[] args) {
//         // output = a c f j o u use the loop and get the ans
//         int dist = 1;
//         for (char ch = 'a'; ch <= 'z'; ch += ++dist) {
//             System.out.print(ch + " ");
//         }
//     }
// }

// codes
// 1 . for A - Z

// public class LoopEg {

//         public static void main(String[] args) {
//             for (char i = 'A'; i <= 'Z'; i++) {
//                 System.out.print(i + "  ");
//             }
//         }
//     }

// 2 . z - a

// public class LoopEg2 {
//     public static void main(String[] args) {
//         for (char i = 'z'; i >= 'a'; i--) {
//             System.out.print(i + "  ");
//         }
//     }

// }
// // 3.Aa Bb ans so on
// public class LoopEg {

//     public static void main(String[] args) {
//         for (char i = 'A', j = 'a'; i <= 'Z' && j <= 'z'; i++, j++) {
//             System.out.print(i + "" + j + "  ");
//         }
//     }
// }

// 4. Az to Za

// public class LoopEg {

//     public static void main(String[] args) {
//         for (char i = 'A', j = 'z'; i <= 'Z' && j >= 'a'; i++, j--) {
//             System.out.print(i + "" + j + "  ");
//         }
//     }
// }
// 5. A65 B-66

// public class LoopEg {

//     public static void main(String[] args) {
//         for (char i = 'A'; i <= 'Z'; i++) {
//             System.out.print(i + "-" + (int) i + "  ");
//         }
//     }
// }
// 6.a97 to z- 122
// public class LoopEg {

//     public static void main(String[] args) {
//         for (char i = 'a'; i <= 'z'; i++) {
//             System.out.print(i + "-" + (int) i + "  ");
//         }
//     }
// }

// 7.0 - 48 to 9 - 57
// public class LoopEg {
//     public static void main(String[] args) {
//         for (char i = '0'; i <= '9'; i++) {
//             System.out.print(i + "-" + (int) i + "  ");
//         }
//     }
// }
// 8.1 to 100
// public class LoopEg {

//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             System.out.print(i + "  ");
//         }
//     }
// }
// 9.100 to 50
// public class LoopEg {

//     public static void main(String[] args) {
//         for (int i = 100; i >= 50; i--) {
//             System.out.print(i + "  ");
//         }
//     }
// }
// 10. 100 to 1 odd nuvmers

// public class LoopEg {
//     public static void main(String[] args) {
//         for (int i = 100; i >= 1; i--) {
//             if (i % 2 != 0) {
//                 System.out.print(i + "  ");
//             }
//         }
//     }
// }
// 11. 1 to 100 even nubers
// public class  LoopEg {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + "  ");
//             }
//         }
//     }
// }
// 12. A C F J O U
// check above
// 13. user input start to end
// check above
// 14. a to z cpital with consonent and vowel

public class LoopEg {

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            String type = switch (i) {
                case 'A', 'E', 'I', 'O', 'U' -> "vowel";
                default -> "consonent";
            };
            System.out.print(i + "" + (char) (i + 32) + "-" + type + "  ");
        }
    }
}
