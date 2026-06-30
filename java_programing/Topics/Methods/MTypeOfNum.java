import java.util.Scanner;

public class MTypeOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a Choice to check type of number:");
            System.out.println(
                    "1. Prime Number\n2. Technum\n3. Armstrong Number\n4. Palindrome Number\n5. Perfect Number\n6. Happy Number\n7. Strong Number\n8. Neon Number\n9. Spy Number\n10. Duck Number\n11. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 11) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            switch (choice) {
                case 1:
                    prime(num);
                    break;
                case 2:
                    technum(num);
                    break;
                case 3:
                    armstrong(num);
                    break;
                case 4:
                    palindrome(num);
                    break;
                case 5:
                    perfect(num);
                    break;
                case 6:
                    happy(num);
                    break;
                case 7:
                    strong(num);
                    break;
                case 8:
                    neon(num);
                    break;
                case 9:
                    spy(num);
                    break;
                case 10:
                    duck(num);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        System.out.println("Thank you for using the program!");
    }

    public static void prime(int num) {
        if (num <= 1) {
            System.out.println("Number is not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }

    public static void technum(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a technum");
        } else {
            System.out.println(num + " is not a technum");
        }
    }

    public static void armstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static void palindrome(int num) {
        int reversed = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (reversed == num) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

    public static void perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }

    public static void happy(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);
        if (slow == 1) {
            System.out.println(num + " is a happy number");
        } else {
            System.out.println(num + " is not a happy number");
        }
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void strong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a strong number");
        } else {
            System.out.println(num + " is not a strong number");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void neon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a neon number");
        } else {
            System.out.println(num + " is not a neon number");
        }
    }

    public static void spy(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println(num + " is a spy number");
        } else {
            System.out.println(num + " is not a spy number");
        }
    }

    public static void duck(int num) {
        String str = Integer.toString(num);
        if (str.contains("0") && !str.startsWith("0")) {
            System.out.println(num + " is a duck number");
        } else {
            System.out.println(num + " is not a duck number");
        }
    }

}
