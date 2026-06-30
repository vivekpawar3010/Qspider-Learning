package src;

public class kaka {
    public static void main(String[] args) {
        String s = "12345";

        String rev = "";
        int n = s.length();
        if (n % 2 != 0) {
            rev += s.charAt(n / 2);
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            rev = s.charAt(n - i - 1) + rev + s.charAt(i);
        }
        System.out.println(rev);

        char[] arrch = s.toCharArray();

        for (int i = n / 2 - 1; i >= 0; i--) {
            char temp = arrch[i];
            System.out.println(arrch[i] + " --" + arrch[n - i - 1]);
            arrch[i] = arrch[n - i - 1];
            arrch[n - i - 1] = temp;
            System.out.println(arrch[i] + " --" + arrch[n - i - 1]);

        }
        String rev2 = new String(arrch);
        System.out.println(rev2);
        System.out.println(arrch);
    }

}
