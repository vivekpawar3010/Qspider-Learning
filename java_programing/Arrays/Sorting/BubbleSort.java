import java.util.*;

class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,21,21};
		System.out.println("Before:- "+ Arrays.toString(arr));
		realBubbleSort(arr, arr.length);
		System.out.println("After:- "+ Arrays.toString(arr));

	}

	public static void bubbleSort(int[] arr, int n){
		for(int i = 0; i < n; i++){
			for(int j =  i + 1; j < n; j++ ){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void realBubbleSort(int[] arr, int n){
		for(int i = 0; i < n; i++){
			for(int j =  0; j < n - i - 1; j++ ){
				if(arr[j + 1] < arr[j]){
					int temp = arr[j + 1];
					arr[ j + 1] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.println(Arrays.toString(arr));
		}
	}
}