package com.java.class08;

import java.util.Scanner;

public class FindGreatestNumberOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
        System.out.println("Please, enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Please, enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Please, enter third number:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The Greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The Greatest number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The Greatest number is: " + num3);
        } else {
            System.out.println("Some numbers are equal");
        }
    }
}
