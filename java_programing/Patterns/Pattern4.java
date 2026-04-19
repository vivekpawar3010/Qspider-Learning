// package Patterns;

public class Pattern4 {

    public static void main(String[] args) {
        int n = 10;
        System.err.println("11111111111-----------------------------\n\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.err.println("2222222222222222-----------------------------\n\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i + 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.err.println("333333333333333333-----------------------------\n\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.err.println("44444444444444444-----------------------------\n\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 > n - i - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}