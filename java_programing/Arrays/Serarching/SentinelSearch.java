class SentinelSearch{
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9,42,56,67,78,79,89};
		System.out.println(search(arr, 1));
	}

	public static int search(int[] arr, int key){
		int n = arr.length;
		int temp = arr[n - 1];
		arr[n - 1] = key;
		int i = 0;
		while(arr[i] != key){
			i++;
		}
		arr[n - 1] = temp;
		if(i < n - 1 || arr[n - 1] == key){
			return i;
		}
		return -1;		
	}

	public static recursiveSearch(int[] arr, int key, int idx){
		int n = arr.length;
		if(idx == 0){
			if(arr[n - 1] == key){
				return n - 1; 
			}
			int temp = arr[n - 1];  // temp is checked so let it free
			arr[n - 1] = key;
		}

		if(arr[idx] != key) return recursiveSearch(arr, key, idx + 1);

		if(idx < n) return idx;
	}
}