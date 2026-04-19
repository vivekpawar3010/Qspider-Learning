package program11;

public class StringRevers {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";
        // use the loop to get the reverse of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }

}
