class MegreSort{
 	public static void main(String[] args) {
 		
 	}

 	public static void sort(int[] arr, int l, int r){

 		if(l < r){
 			int mid = l + (r - l) / 2;
 			sort(arr, l, mid);
 			sort(arr, mid + 1, r);

 			merge(arr, l, mid, r);
  		}
 	}

 	public static void merge(int[] arr, int l, int mid, int r){
 		int leftLen = mid - l + 1;
 		int rightLen = r - mid;

 		int[] leftArr = new int[leftLen];
 		int[] rightArr = new int[rightLen];

 		for(int i = 0; i < leftLen; i++) leftArr[i] = arr[l + 1];
 		for(int i = 0; i < rightLen; i++) rightArr[i] = arr[min + i + 1];

 		int i = 0, j = 0, k = l;
 		while(i < leftLen && j < rightLen){
 			if(leftArr[i] < rightArr[j]) arr[k++] = leftArr[i++];
 			else arr[k++] = rightArr[j++];
 		}

 		while(i < leftLen) arr[k++] = leftArr[i++];
 		while(j < rightLen) arr[k++] = rightArr[j++];

 	}
}