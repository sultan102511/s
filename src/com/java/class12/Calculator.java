package com.java.class12;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the first number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the name of the operator you would like to use: ");
        String opr = sc.next();

        switch (opr) {
            case "add":
            case "+":
                addition(num1, num2);
                break;
            case "sub":
            case "-":
                subtraction(num1, num2);
                break;
            case "mul":
            case "*":
                multiplication(num1, num2);
                break;
            case "div":
            case "/":
                division(num1, num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Please enter a valid operation name");
        }
    }

    static void addition(int a, int b) {
        System.out.println(a + b);
    }

    static void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void division(int num1, int num2) {
        System.out.println(num1 / num2);
    }


}
