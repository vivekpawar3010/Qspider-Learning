package allPillerProject;

public class NumberProgramImplim implements NumberPrograms {
	
    public NumberProgramImplim() {
    }
    
    // 1. Prime 
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        int den = 2;
        while (n > den) {
            if (n % den == 0) return false;
            den++;
        }
        return true;
    }
    
//    2. ArmStrong
    public boolean isArmStrong(int n) {
        int temp = n;
        int count = Count(n);
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            int mul = 1;
            for (int i = 0; i < count; i++) {
                mul *= last;
            }
            sum += mul;
            n /= 10;
        }
        return temp == sum;
    }
//   3. Spy
    public boolean isSpy(int num) {
        int sum = 0;
        int prod = 1;
        int temp = num;
        while (temp > 0) {
            int last = temp % 10;
            sum += last;
            prod *= last;
            temp /= 10;
        }
        return sum == prod && num > 0;
    }
//  4.Happy
    public boolean isHappy(int num) {
    	while (num != 1 && num != 4) {
            num = sumOfSquares(num);
        }
        return num == 1;
    }
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int d = Math.abs(n % 10);
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

// 	 5.Unique
    public boolean isUnique(int num) {
    	for (int i = 0; i <= 9; i++) {
            int ct = 0;
            for (int j = num; j != 0; j /= 10) {
                if (j % 10 == i)
                    ct++;
            }
            if (ct >= 2)
                return false;
        }
        return true;
    }
//     6.Tech 
    public boolean isTech(int num) {
        if (num < 0) return false;
        int count = Count(num);
        if (count % 2 != 0) return false;

        int divisor = power(10, count / 2);
        int firstHalf = num / divisor;
        int secondHalf = num % divisor;
        int sum = firstHalf + secondHalf;
        
        return (sum * sum) == num;
    }
//    7.Neon
    public boolean isNeon(int num) {
        int sq = num * num;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }
//    9. isPalindrom
    public boolean isPalindrom(int num) {
    	int rev = 0;
    	int cp = num;
    	while(cp > 0) {
    		rev = (rev * 10) + cp % 10;
    		cp /= 10;
    	}
    	return rev == num;
    }
//    10.Strong
    public boolean isStrong(int num) {
    	int factSum = 0;
    	int cp = num;
    	while(cp > 0) {
    		factSum += factorial(cp % 10);
    		cp /= 10;
    	}
    	return factSum == num;
    }
    
    public static int Count(int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static int power(int base, int exp) {
    	int ans = base;
    	while(exp > 1) {
    		ans *= base;
    	}
    	return ans;
    }
    
    public static int factorial(int num) {
    	int fact = 1;
    	while(num > 0) {
    		fact *= num;
    		num--;
    	}
    	return fact;
    }
}
