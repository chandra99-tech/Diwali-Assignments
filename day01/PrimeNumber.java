package day01;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            isPrimeNumber(num); // Use camelCase for method name
        } catch (Exception e) {
            System.out.println("Please enter a valid integer");
        } finally {
            sc.close(); // Close Scanner to prevent resource leak
        }
    }

    private static void isPrimeNumber(int num) {
        // Handle edge cases: numbers less than 2 are not prime
        if (num < 2) {
            System.out.println(num + " is not a prime number");
            return;
        }
        // 2 is the only even prime number
        if (num == 2) {
            System.out.println(num + " is a prime number");
            return;
        }
        // Check for divisibility up to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return; // Exit after finding a divisor
            }
        }
        System.out.println(num + " is a prime number");
    }
}