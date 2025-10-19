package day01;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers");
            } else {
                long result = factorial(n);
                System.out.println("Factorial of " + n + " is: " + result);
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}