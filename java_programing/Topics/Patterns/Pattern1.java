class Pattern1 {
    public static void main(String[] args) {
        int n = 17;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 /* for borders */
                        || i == j || i + j == n - 1 /* for diagonals */
                        || i == n / 2 || j == n / 2 /* for + signplus */

                ) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");

                }
            }
            System.out.println();
        }

    }
}

/*
 * * * * * * * * * * * * * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * * * * * * * * * * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * * * * * * * * * * * * * *
 * 
 */