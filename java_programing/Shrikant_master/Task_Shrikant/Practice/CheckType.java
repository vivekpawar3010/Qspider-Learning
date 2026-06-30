import java.util.Scanner;

// ************************** Didit or Not *********************************

// class CheckType {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character: ");
//         char ch = sc.next().charAt(0);

//         String output  =

//         (ch >= 48 && ch <= 57) ? (ch + " it is Digit") : (ch + " it is not digit");

//         System.out.println(output);
//     }
// }

// **************************** Alphabet or not ********************************

// class CheckType {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the character: ");
//         char ch = sc.next().charAt(0);

//         String output  =

//         (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) ? (ch + " it is Alphabet") : (ch + " it is not Alphabet");

//         System.out.println(output);
//     }
// }

// **************************** Special Character or not ********************************

// class CheckSpecial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);

//         String output = (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
//                 ? (ch + " is an Alphabet")
//                 : (ch >= 48 && ch <= 57)
//                         ? (ch + " is a Digit")
//                         : (ch + " is a Special Character");

//         System.out.println(output);
//     }
// }

// // ************************** Uppercase Lowercase or nothing  *********************

class CheckType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String output = (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
                ? ((ch >= 65 && ch <= 90) ? (ch + " is it Upperrcase") : (ch + " is it Lowercase"))
                : ("it is Nothing");

        System.out.println(output);
    }
}
