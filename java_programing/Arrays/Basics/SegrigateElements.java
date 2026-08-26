public class SegrigateElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 5, 4, 3, 6, 3 };

        segrigateEvenOdd(arr);
    }

    public static void segrigateEvenOdd(int[] arr) {

    }
    public static void segrigateNegativePositive(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                int j = i + 1;
                while(j < n){
                    if(arr[j] < 0){
                        int temp = arr[j];
                        int k = j;
                        while(k > i)
                    }
                    j++;
                }
            }
        }
    }
}
