import java.util.Arrays;

public class CharArrays {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
        System.out.println("The Current Array is");
        System.out.println(Arrays.toString(arr));
        System.out.println("Having the size " + arr.length);
        int n = arr.length;

        System.out.println("1) Frequency of each element:");
        freqEle(arr, n);
        System.out.println("2) List of Distinct Element in the Array:-");
        distEle(arr, n);
        System.out.println("3) List of Duplicate Element in the Array:-");
        dupliEle(arr, n);
        System.out.println("4) List of Unique Element in the Array:-");
        uniqEle(arr, n);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Element with First minimum frequency: ");
        firstMinFreqEle(arr, n);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Element with Second minimum frequency: ");
        secondMinFreqEle(arr, n);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Element with Third minimum frequency: ");
        thirdMinFreqEle(arr, n);

        System.out.println("______________________________________________________________");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Element with First Maximum frequency: ");
        firstMaxFreqEle(arr, n);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Element with Second Maximum frequency: ");
        secondMaxFreqEle(arr, n);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Element with Third Maximum frequency: ");
        thirdMaxFreqEle(arr, n);
    }

    public static void freqEle(char[] arr, int n) {
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + freq);
        }
    }

    public static void distEle(char[] arr, int n) {
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    check[j] = true;
                }
            }
            System.out.println(arr[i] + " ");
        }
    }

    public static void dupliEle(char[] arr, int n) {
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }
            if (freq > 1)
                System.out.println(arr[i] + " ");
        }
    }

    public static void uniqEle(char[] arr, int n) {
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }
            if (freq == 1)
                System.out.println(arr[i] + " ");
        }
    }

    public static char firstMinFreqEle(char[] arr, int n) {
        int minf = Integer.MAX_VALUE;
        char ele = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }

            if (freq < minf) {
                minf = freq;
                ele = arr[i];
            }
        }
        System.out.println("Element : " + ele + " Frequency : " + minf);
        return ele;
    }

    public static char secondMinFreqEle(char[] arr, int n) {
        int minf1 = Integer.MAX_VALUE, minf2 = minf1;
        char ele1 = 0, ele2 = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }

            if (freq < minf1) {
                minf2 = minf1;
                ele2 = ele1;
                minf1 = freq;
                ele1 = arr[i];
            } else if (freq < minf2 && freq != minf1) {
                minf2 = freq;
                ele2 = arr[i];
            }
        }
        System.out.println("Element : " + ele2 + " Frequency : " + minf2);
        return ele2;
    }

    public static char thirdMinFreqEle(char[] arr, int n) {
        int minf1 = Integer.MAX_VALUE, minf2 = minf1, minf3 = minf2;
        char ele1 = 0, ele2 = 0, ele3 = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }

            if (freq < minf1) {
                minf3 = minf2;
                ele3 = ele2;
                minf2 = minf1;
                ele2 = ele1;
                minf1 = freq;
                ele1 = arr[i];
            } else if (freq < minf2 && freq != minf1) {
                minf3 = minf2;
                ele3 = ele2;
                minf2 = freq;
                ele2 = arr[i];
            } else if (freq < minf3 && freq != minf1 && freq != minf2) {
                minf3 = freq;
                ele3 = arr[i];
            }
        }
        System.out.println("Element : " + ele3 + " Frequency : " + minf3);
        return ele3;
    }

    public static char firstMaxFreqEle(char[] arr, int n) {
        int maxf = Integer.MIN_VALUE;
        char ele = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }

            if (freq > maxf) {
                maxf = freq;
                ele = arr[i];
            }
        }
        System.out.println("Element : " + ele + " Frequency : " + maxf);
        return ele;
    }

    public static char secondMaxFreqEle(char[] arr, int n) {
        int maxf1 = Integer.MIN_VALUE, maxf2 = maxf1;
        char ele1 = 0, ele2 = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }

            if (freq > maxf1) {
                maxf2 = maxf1;
                ele2 = ele1;
                maxf1 = freq;
                ele1 = arr[i];
            } else if (freq > maxf2 && freq != maxf1) {
                maxf2 = freq;
                ele2 = arr[i];
            }
        }
        System.out.println("Element : " + ele2 + " Frequency : " + maxf2);
        return ele2;
    }

    public static char thirdMaxFreqEle(char[] arr, int n) {
        int maxf1 = Integer.MIN_VALUE, maxf2 = Integer.MIN_VALUE, maxf3 = Integer.MIN_VALUE;
        char ele1 = 0, ele2 = 0, ele3 = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (check[i])
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    check[j] = true;
                }
            }

            if (freq > maxf1) {
                maxf3 = maxf2;
                ele3 = ele2;
                maxf2 = maxf1;
                ele2 = ele1;
                maxf1 = freq;
                ele1 = arr[i];
            } else if (freq > maxf2 && freq != maxf1) {
                maxf3 = maxf2;
                ele3 = ele2;
                maxf2 = freq;
                ele2 = arr[i];
            } else if (freq > maxf3 && freq != maxf1 && freq != maxf2) {
                maxf3 = freq;
                ele3 = arr[i];
            }
        }
        System.out.println("Element : " + ele3 + " Frequency : " + maxf3);
        return ele3;
    }
}
// 23 july
// 1) freq of ele
// 2) distinct ele
// 3) duplicate lee
// 4) Unique ele

// same 4 for the
// int arr, char arr, stirng arr

// first highest repeating ele
// second highest repeaing ele
// third highest repeaing ele

// same 3 for int arr, char arr , string arr

// first smallest repeating ele
// second smallest repeaing ele
// third smallest repeaing ele

// same 3 for int arr, char arr , string arr

// total 30
