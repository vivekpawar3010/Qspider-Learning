import java.util.Arrays;

class rotateVowels {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'e', 'i', 'o', 'u' };
        clockwiseRotation(arr);
        System.out.println("_________________________");
        char[] arr1 = { 'a', 'b', 'c', 'e', 'i', 'o', 'u' };
        antiClockwiseRotation(arr1);
    }

    public static void clockwiseRotation(char[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            char ch = arr[i];
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u') {
                char temp = ch;
                int j = i - 1;
                int k = i;
                while (j >= 0) {
                    char ch1 = arr[j];
                    if (ch1 == 'a' || ch1 == 'o' || ch1 == 'i' || ch1 == 'e' || ch1 == 'u') {
                        arr[k] = arr[j];
                        k = j;
                    }
                    j--;
                }
                arr[k] = temp;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void antiClockwiseRotation(char[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u') {
                char temp = ch;
                int j = i + 1;
                int k = i;
                while (j < arr.length) {
                    char ch1 = arr[j];
                    if (ch1 == 'a' || ch1 == 'o' || ch1 == 'i' || ch1 == 'e' || ch1 == 'u') {
                        arr[k] = arr[j];
                        k = j;
                    }
                    j++;
                }
                arr[k] = temp;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}