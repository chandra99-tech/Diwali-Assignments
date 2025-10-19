package day01;

import java.util.Scanner;

public class PrimeNumbersUpToN {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 2) {
                System.out.println("No primes below 2");
            } else {
                System.out.print("Prime numbers up to " + n + ": ");
                for (int i = 2; i <= n; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}