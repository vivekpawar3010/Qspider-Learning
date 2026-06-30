package java_programing.NestedLoop;

public class NthDisariumNum {
    public static void main(String[] args) {
        int num = 10;
        int count = 0;
        int currentNum = 1;

        while (true) {
            int tempCount = 0;
            for (int i = currentNum; i > 0; i /= 10) {
                tempCount++;
            }

            int sum = 0;
            int temp = currentNum;
            int currentPower = tempCount;

            while (temp > 0) {
                int last = temp % 10;
                int prod = 1;
                for (int i = 0; i < currentPower; i++) {
                    prod *= last;
                }
                sum += prod;
                temp /= 10;
                currentPower--;
            }

            if (sum == currentNum) {
                count++;
                if (count == num) {
                    System.out.println("The " + num + "th Disarium Number is: " + currentNum);
                    break;
                }
            }
            currentNum++;
        }
    }
}