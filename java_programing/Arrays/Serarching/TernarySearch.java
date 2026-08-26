class TernarySearch{
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9,42,56,67,78,79,89};
		System.out.println(search(arr, 1));
		System.out.println(recursiveSearch(arr, 1));
	}

	public static int search(int[] arr, int key){
		int low = 0, high = arr.length;

		while(low <= high){
			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;
			if(arr[mid2] == key) return mid2;
			if(arr[mid1] == key) return mid1;
			
			if(key < arr[mid1]){
				high = mid1 - 1;
			}else if(key > arr[mid2]){
				low = mid2 + 1;
			}else{
				low = mid1 + 1;
				high = mid2 - 1;
			}
		}
		return -1;
	}

	public static int recusiveSearch(int[] arr, int key, int low, int high){

		if(low > high)return -1;
		int mid1 = low + (high - low) / 3;
		int mid2 = high - (high - low) / 3;
		if(arr[mid2] == key) return mid2;
		if(arr[mid1] == key) return mid1;
		
		if(key < arr[mid1]){
			return recursionSearch(arr, key, low, mid1 - 1);
		}else if(key > arr[mid2]){
			return recursionSearch(arr, key, mid2 + 1, high);
		}

		return recursionSearch(arr, key, mid1 + 1, mid2 - 1);
		
	}
}