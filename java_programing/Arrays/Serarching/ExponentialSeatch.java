import java.util.*;

class ExponentialSeatch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12, 13, 34, 45, 55, 56, 57, 67, 68, 78, 79, 789 };
		System.out.println(Arrays.toString(arr));
	}

	public static int exponentialSearch(int arr[], int n, int x) {
		if (arr[0] == x)
			return 0;

		int i = 1;
		while (i < n && arr[i] <= x)
			i = i * 2;

		return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
	}

	public static int recursiveExponentialSearch(int arr[], int n, int x, int exp) {
		if (n == 0)
			return -1;
		if (exp < 1)
			exp = 1;
		if (arr[0] == x)
			return 0;

		if (exp >= n || arr[exp] > x)
			return Arrays.binarySearch(arr, exp / 2, Math.min(exp, n), x);

		return recursiveExponentialSearch(arr, n, x, exp * 2);

	}
}