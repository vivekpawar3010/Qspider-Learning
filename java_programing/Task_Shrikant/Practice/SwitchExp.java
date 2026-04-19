public class SwitchExp {
    public static void main(String... args) {
        System.out.print("Enter a character: ");
        char ch = new java.util.Scanner(System.in).next().charAt(0);
        String output = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> "Vowel";
            default -> "Consonant";
        };
        System.out.println(ch + "-" + output);
    }
}
