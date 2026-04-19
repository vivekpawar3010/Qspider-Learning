// package LoopExamples;

import java.util.Scanner;

public class Squrt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                System.out.println("Square root of negative number is not real.");
            } else {
                double guess = number / 2; // initial guess
                double epsilon = 0.000001; // precision

                while (true) {
                    double newGuess = (guess + number / guess) / 2;
                    System.out.println("Current guess: " + newGuess);
                    if (Math.abs(newGuess - guess) < epsilon) {
                        break;
                    }

                    guess = newGuess;
                }

                System.out.println("Square root of " + number + " is: " + guess);
            }
        }
        scanner.close();
    }
}