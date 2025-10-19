package day01;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }
}