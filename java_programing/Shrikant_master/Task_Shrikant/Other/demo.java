import java.util.*;

class demo {
    public static void main(String[] args) {
        char ch;
        System.out.println("Entr a character :");
        ch = new Scanner(System.in).next().toUpperCase().charAt(10);
        String op = (ch == 'A' || ch == 'U' || ch == 'I' || ch == 'E' || ch == 'O') ? // oprend 1
                (ch + " this is a Vowel") : // operand 2 if true
                (ch + " this is a consonents"); // operand 3 if false
        System.out.println(op);
    }
}