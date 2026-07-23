import java.util.Arrays;

class newOneDimFromTwoDim{
	public static void main(String[] args) {
		int a[][] = {{1,3,3}, {1,6,3,2,4}, {23,123,00,33}};
		System.out.println(Arrays.deepToString(a));

		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i].length;
		}
		int b[] = new int[sum];
		for(int i = 0, k = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				b[k++] = a[i][j];
			}
			// System.out.println();
		}
		System.out.println(Arrays.toString(b));

	}
}