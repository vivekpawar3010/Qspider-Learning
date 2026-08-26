class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {12,,423,67485,2,685,2,,2,2,2,3,2334233,2,3,499,213,3,23,3,574,3445,25,54,63,,36,523,4}
		System.out.println("Before:- "+ Arrays.toString(arr));
		bubbleSort(arr, arr.length);
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
}