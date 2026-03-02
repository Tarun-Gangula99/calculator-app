package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Maven Calculator ===");

        while (true) {
            System.out.println("\n1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result: " + calc.add(a, b));
                case 2 -> System.out.println("Result: " + calc.subtract(a, b));
                case 3 -> System.out.println("Result: " + calc.multiply(a, b));
                case 4 -> System.out.println("Result: " + calc.divide(a, b));
                default -> System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
