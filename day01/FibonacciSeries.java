package day01;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.print("Enter the number of Fibonacci terms: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Enter a positive number");
            } else {
                System.out.print("Fibonacci series up to " + n + " terms: ");
                printFibonacci(n);
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }

    private static void printFibonacci(int n) {
        long a = 0, b = 1;
        if (n == 1) {
            System.out.print(a);
        } else {
            System.out.print(a + " " + b);
            for (int i = 3; i <= n; i++) {
                long next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
        System.out.println();
    }
}
