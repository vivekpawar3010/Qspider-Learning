import java.util.*;

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12, 13, 34, 45, 55, 56, 57, 67, 68, 78, 79, 789 };
        System.out.println(Arrays.toString(arr));

        int x = 34;
        System.out.println("Iterative jump search index: " + jumpSearch(arr, arr.length, x));
        System.out.println("Recursive jump search index: " + recursiveJumpSearch(arr, arr.length, x));
    }

    public static int jumpSearch(int arr[], int n, int x) {
        if (n == 0)
            return -1;

        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (prev < n && arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        while (prev < n && arr[prev] < x) {
            prev++;
        }

        return (prev < n && arr[prev] == x) ? prev : -1;
    }

    private static int linearSearch(int arr[], int start, int end, int x) {
        for (int i = start; i < end; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
