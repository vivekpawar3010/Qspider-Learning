import java.util.Arrays;



class ChaitanyaTraning{
	public static void main(String[] args) {
		int[] num = {2, 25, 37, 3, 5, 7, 11,12, 14, 15, 16, 18, 4, 6, 8, 9, 10,  20, 21, 22, 24};
		System.out.println(Arrays.toString(num));

		int k = 4;
		System.out.println("The kth Largest ele in above array is "+findKthLargeele(num, k));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

		// System.out.println("The Largest Prime in above array is "+findLargePrime(num));



	}

	public static int findKthLargeele(int[] num, int k){
		// int kthLargest = nums[0];
		for(int it = 1; it <= k; it++){
			int j = 0;
			for(int i = 0; i < num.length - it;i++){
				if(num[j] < num[i]){
					j = i;
					// int temp = num[i];
					// num[i] = num[i + 1];
					// num[i + 1] = temp;
				}
		 	}
		 	int lidx = num.length - it;
		 	int temp = num[lidx];
			num[lidx] = num[j];
			num[j] = temp;
		}
		System.out.println(Arrays.toString(num));

		return num[num.length - k];
	}

	public static int findLargePrime(int[] arr){
		int maxp = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++){
			if(arr[i] > maxp && isPrime(arr[i])){
				maxp = arr[i];
			}
		}
		return maxp;
	}

	public static boolean isPrime(int n){

		int den = 2;
		while(den * den <= n){
			if(n % den == 0) return false;
			den++;
		}
		return true;

	}
}




// class ChaitanyaTraning{

// 	public static void main(String[] args) {
		
// 		int a[][] = {{-1,-3,-3}, {1,6,3,2,4}, {33,23,00,33}, {}, {12,12,12,23}};
// 		// System.out.println(Arrays.deepToString(a));

// 		int[] b = convert2Dto1D(a);
// 		System.out.println(Arrays.toString(b));
// 		System.out.println("The first largest element in unsorted array " + firstLargestUnsorted(b));
// 		System.out.println("The Second largest element in unsorted array " + secondLargestUnsorted(b));
// 		System.out.println("The Third largest element in unsorted array " + thirdLargestUnsorted(b));
// 		System.out.println("The first Smallest element in unsorted array " + firstSmallestunSorted(b));
// 		System.out.println("The Second Smallest element in unsorted array " + secondSmallestunSorted(b));
// 		System.out.println("The Third Smallest element in unsorted array " + thirdSmallestunSorted(b));


// 		Arrays.sort(b);
// 		int[] sortedb = b;
// 		System.out.println(Arrays.toString(sortedb));



// 		// for(int i = 0; i < a.length; i++){
// 		// 	for(int j = 0; j < a[i].length; j++){
// 		// 		System.out.print(a[i][j] + " ");
// 		// 	}
// 		// 		System.out.println();
// 		// }

// 		// int i = 0;
// 		// while(i < a.length){
// 		// 	int j = 0;
// 		// 	while(j < a[i].length){
// 		// 		System.out.print(a[i][j++] + " ");
// 		// 	}
// 		// 		System.out.println();
// 		// 		i++;

// 		// }

// 	}



// 	public static int thirdLargestUnsorted(int[] b){
// 		int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max2;
// 		for(int i = 0; i < b.length; i++){
// 			if(b[i] > max1){
// 				max3 = max2;
// 				max2 = max1;
// 				max1 = b[i];
// 			}else if(b[i] > max2 && b[i] != max1){
// 				max3 = max2;
// 				max2 = b[i];
// 			}else if(b[i] > max3 && b[i] != max2 && max1 != b[i]){
// 				max3 = b[i];
// 			}
// 		}
// 		return max3;
// 	}
// 	public static int thirdSmallestunSorted(int[] b){
// 		int min1 = Integer.MAX_VALUE, min2 = min1, min3 = min2;
// 		for(int i = 0 ; i < b.length;i++){
// 			if(b[i] < min1) {
// 				min3 = min2;
// 				min2 = min1;
// 				min1 = b[i];
// 			}else if(b[i] < min2 && b[i] != min1){
// 				min3 = min2;
// 				min2 = b[i];	
// 			}else if(b[i] < min3 && b[i] != min1 && b[i] != min2){
// 				min3 = b[i];
// 			}
			
// 		}
// 		return min3	;
// 	}







// 	public static int secondSmallestSorted(int[] b){
// 		int min1 = Integer.MAX_VALUE, min2 = min1;
// 		for(int i = 0 ; i < b.length;i++){
// 			if(b[i] < min1) {
// 				min2 = min1;
// 				min1 = b[i];
// 			}else if(b[i] < min2 && b[i] != min1){
// 				min2 = b[i];	
// 			}
// 		}
// 		return min2	;
// 	}


// 	public static int secondLargestUnsorted(int[] b){
// 		int max1 = Integer.MIN_VALUE, max2 = max1;
// 		for(int i = 0 ; i < b.length;i++){
// 			if(b[i] > max1) {
// 				max2 = max1;
// 				max1 = b[i];
// 			}else if(b[i] > max2 && b[i] != max1){
// 				max2 = b[i];	
// 			}
// 		}
// 		return max2;
// 	}



// 	public static int firstLargestUnsorted(int[] b){
// 		int max1 = Integer.MIN_VALUE;
// 		for(int i = 0; i < b.length; i++){
// 			if(b[i] > max1) max1 = b[i];
// 		}
// 		return max1;
// 	}

// 	public static int firstSmallestSorted(int[] b){
// 		int min1 = Integer.MAX_VALUE;
// 		for(int i = 0; i < b.length; i++){
// 			if(b[i] < min1) min1 = b[i];
// 		}
// 		return min1;
// 	}

// 	public static int[] convert2Dto1D(int[][] b){
// 		int len1D = 0;
// 		for(int i = 0; i < b.length; i++){
// 			len1D += b[i].length;
// 		}

// 		int[] a = new int[len1D];
// 		int k = 0;
// 		for(int i = 0; i < b.length; i++){
// 			for(int j = 0; j < b[i].length; j++){
// 				a[k++] = b[i][j];
// 			}
// 		}

// 						// System.out.println(Arrays);
// 			return a;
// 	}
// }

// // 1. Print 2D array using `for`, `while`, and `do-while` loops.
// // 2. Merging a 2D array into a 1D array.
// // 3. Find the 1st largest, 2nd largest, and 3rd largest elements in an unsorted array.
// // 4. Find the 1st largest, 2nd largest, and 3rd largest elements in a sorted array.
// // 5. Find the 1st minimum, 2nd minimum, and 3rd minimum elements in an unsorted array.
// // 6. Find the 1st minimum, 2nd minimum, and 3rd minimum elements in a sorted array.
// // 7. Find the difference between the maximum and minimum elements.
// // 8. Find the largest prime element.