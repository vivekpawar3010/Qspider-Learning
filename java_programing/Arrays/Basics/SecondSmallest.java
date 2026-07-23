import java.util.Arrays;
class SecondSmallest{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,3,4,3,5,5,6,3,5534,6,43,643,342,5,3,4,4};

		// int sSmall = secondSmallestEle(arr);
		// System.out.println(sSmall);

		// int Smax = secondMaxBySort(arr);
		// System.out.println(Smax);
		// int Tmax = thirdMaxBySort(arr);
		// System.out.println(Tmax);

		int a, b;
		a = 10, b = 20;

		// System.out.println(Arrays.toString(arr));
		// int[] sorted = Arrays.sort(arr);
		// System.out.println(Arrays.toString(sorted));

	}
	public static int secondSmallestEle(int[] arr){
		int min = Integer.MAX_VALUE, min2 = min;
		for(int a: arr){
			if(a < min){
				min2 = min;
				min = a;
			}else if(min2 > a && a != min){
				min2 = a;
			}
		}
		return min2;
	}

	public static int secondMaxBySort(int[] arr){
		Arrays.sort(arr);
		int max = arr[arr.length - 1], max2 = Integer.MIN_VALUE;
		for(int i = arr.length - 2; i > 0; i--){
			if(max2 < arr[i] && arr[i] != max){
				max2 = arr[i];
				break;
			}
		}
		return max2;
	}
	public static int thirdMaxBySort(int[] arr){
		Arrays.sort(arr);
		int max = arr[arr.length - 1], max2 = Integer.MIN_VALUE, max3 = max2;
		for(int i = arr.length - 2; i > 0; i--){
			if(max2 < arr[i] && arr[i] != max){ 		
				max2 = arr[i];
			}else if(max3 < arr[i] && arr[i] != max2 && arr[i] != max2){
				max3 = arr[i];
				break;
			}
		}
		return max3;
	}
}