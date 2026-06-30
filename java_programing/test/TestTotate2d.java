package test;

public class TestTotate2d {
    public static void main(String[] args) {
        char[][] grid = {
                { '#', '#', '*', '.', '*', '.' },
                { '#', '#', '#', '*', '.', '.' },
                { '#', '#', '#', '.', '#', '.' }
        };
        char[][] rotated = updateOnRule(grid);
        rotated = rotate(rotated);

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[0].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] rotate(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        d
    }

    public static char[][] updateOnRule(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        char[][] updated = new char[m][n];

        for (int i = 0; i < m; i++) {
            int dot = 0;
            int hash = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '.')
                    dot++;
                else if (matrix[i][j] == '#')
                    hash++;
                else {
                    updated[i][j] = matrix[i][j];
                    int k = j - 1;
                    while (hash > 0) {
                        updated[i][k--] = '#';
                        hash--;
                    }
                    while (dot > 0) {
                        updated[i][k--] = '.';
                        dot--;
                    }
                }
            }
            int k = n - 1;
            while (hash > 0) {
                updated[i][k--] = '#';
                hash--;
            }
            while (dot > 0) {
                updated[i][k--] = '.';
                dot--;
            }
        }
        return updated;
    }
}
