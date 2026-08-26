import java.util.*;
class SelectionSort{

	public static void main(String[] args) {
		
		int arr[] = {1,5,3,9,6,8,6,4,68,5,785,344,7,53};

		System.out.println(" Before sort " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println(" After sort " + Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr, int n){

		for(int i = 0; i < n; i++){
			int m = i;
			for(int j = i + 1; j < n; j++){
				if(arr[j] <	 arr[m]){
					m = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[m];
			arr[m] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}