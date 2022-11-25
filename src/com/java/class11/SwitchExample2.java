package com.java.class11;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the first number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter the name of the operator you would like to use: ");
        String opr = sc.next();

        switch (opr) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Please enter a valid operation name");
        }
    }
}
