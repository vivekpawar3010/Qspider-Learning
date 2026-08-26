class BinarySearch{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5,6,7,7,8,9,10,23};
		System.out.println(recursionSearch(arr, 5, 0, arr.length - 1));
	}

	public static int search(int[] arr, int key){
		int low = 0, high = arr.length;
		while(low <= high){
			int mid = low + (high - low) /2;
			if(arr[mid] < key) low = mid + 1;
			else if(arr[mid] > key) high = mid - 1;
			else return mid;
		}
		return -1;
	}
	public static int recursionSearch(int[] arr, int key, int low, int high){
		if(low > high) return -1;
		int mid = low + (high - low) /2;
		if(arr[mid] < key) return recursionSearch(arr, key, mid + 1, high);
		else if(arr[mid] > key) return recursionSearch(arr, key , low, mid - 1);
		return mid;
	}
}