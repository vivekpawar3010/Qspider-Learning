// AddElementInArray.java
import java.util.Arrays;
// import java.util.

class AddElementInArray{
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5, 6};
		int arr2[] = {7,8,9,10};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// addElement(6, arr);
		// removeElement(3, arr);
		// addElementIndex(2,6, arr);
		// removeElement(arr, new int[]{});
		Merge2ArrayElement(arr1, arr2);
		Merge2ArrayElementZigZag(arr1, arr2);
	}
	public static void addElement(int num, int[] arr){
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = num;
		System.out.println(Arrays.toString(newArr));
	}

	public static void addElementIndex(int idx,int num, int[] arr){
		int[] newArr = new int[arr.length + 1];
		int j = 0;
		for(int i = 0; i < arr.length; i++){
			if(i == idx) {
				newArr[j++]  = num;
				newArr[j++] = arr[i];
				continue;
			}
			newArr[j++] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static void removeElement(int idx, int[] arr){
		int[] newArr = new int[arr.length - 1];
		for(int i = 0, j = 0; i < arr.length; i++, j++){
			if(i == idx){
				j--;
				continue;
			}
			newArr[j] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static void Merge2ArrayElement(int[] arr1, int[] arr2){
		int size1 = arr1.length, size2 = arr2.length;
		int[] newArr = new int[size1 + size2];
		for(int i = 0; i < newArr.length; i++){
			if(i < size1){
				newArr[i] = arr1[i];	
			}else{
			 newArr[i] = arr2[i - size1];				
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static void Merge2ArrayElementZigZag(int[] arr1, int[] arr2){
		int size1 = arr1.length, size2 = arr2.length;
		int[] newArr = new int[size1 + size2];
		int maxLen = (size1 > size2)? size1:size2;
		int  j = 0;
		for(int i = 0; i < maxLen; i++){
			if(i < size1){
				newArr[j++] = arr1[i];	
			}
			if(i < size2){
			 	newArr[j++] = arr2[i];				
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}