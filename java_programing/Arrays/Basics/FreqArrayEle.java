class FreqArrayEle{
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,6,3,5,3,2,2,5,6,4,6,5,12};
		int[] minfreqEle = minFreq(arr, arr.length);
		System.out.println("The min freq ele is " + minfreqEle[1] + "with the freq " + minfreqEle[0]);

	}

	// mehtod to get the freq of each ele
	public static void freqEle(int[] arr, int n){
		boolean[] check = new boolean[n];

		for(int i = 0; i < n; i++){
			if(check[i]) continue;

			int freq = 1;
			for(int j = i + 1; j < n; j++){
				if(arr[i] == arr[j]){
					freq++;
					check[j] = true;
				}
			}
			System.out.println(arr[i] + " : " + freq);
		}
	}
	// method to get teh unique element
	// mehtod to gett teh duplicate ele

	// ele with the max freq

	public static int[] maxFreq(int arr[], int n){
		int maxf = Integer.MAX_VALUE;
		int ele = 0;
		boolean[] check = new boolean[n];

		for(int i = 0; i < n; i++){
			if(check[i]) continue;

			int freq = 1;
			for(int j = i + 1; j < n; j++){
				if(arr[i] == arr[j]){
					freq++;
					check[j] = true;
				}
			}

			if(freq > maxf){
				maxf = freq;
				ele = arr[i];
			}
		}

		return new int[] {maxf, ele};
	}

	// ele with teh min freq

	public static int[] minFreq(int arr[], int n){
		int maxf = Integer.MAX_VALUE;
		int ele = 0;
		boolean[] check = new boolean[n];

		for(int i = 0; i < n; i++){
			if(check[i]) continue;

			int freq = 1;
			for(int j = i + 1; j < n; j++){
				if(arr[i] == arr[j]){
					freq++;
					check[j] = true;
				}
			}

			if(freq < maxf){
				maxf = freq;
				ele = arr[i];
			}
		}

		return new int[] {maxf, ele};
	}
}