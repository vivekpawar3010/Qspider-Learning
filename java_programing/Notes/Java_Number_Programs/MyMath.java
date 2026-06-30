public class MyMath {
    public static int pow(int n, int x) {
        int res = n;
        if (x < 0) {
            n = 1 / n;
            x = -x;
        }
        x--;
        while (x > 0) {
            res *= n;
        }
        return res;
    }

    public static int lenNum(int n) {
        int len = 0;
        for (int i = n; i != 0; i /= 10) {
            len++;
        }
        return len;
    }

    public static int tenpow(int n) {
        int pow = 1;
        for (int i = 0; i < n; i++) {
            pow *= 10;
        }
        return pow;
    }
}
