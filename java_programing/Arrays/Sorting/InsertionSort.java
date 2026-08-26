import java.util.*;

class InsertionSort{

	public static void main(String[] args) {
		int[] arr = {1,2,4,2,5,3,53,2445,245,2,52,45,245,22};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr){
		int n = arr.length;
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}