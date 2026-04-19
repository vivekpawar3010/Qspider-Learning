public class AssignmentG {

    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        System.out.println("Pattern 1: G increasing number in G order");
        int update = (n - 1) * 4 - 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.print(i + " ");
                } else if (j < i) { 
                    arr[j - 1] = arr[j - 1] + update;
                }
                System.out.print(arr[j - 1] + " ");
            }
            System.out.println();

        }
    }
}

// // output:-
// 1 12 11 10
// 2 13 16 9
// 3 14 15 8
// 4 5 6 7