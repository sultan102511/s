package com.java.class09;

import java.util.Scanner;

public class FIndGreatestNumberOutOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter a number: ");
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("This is the greatest number: " + num1);
            } else {
                System.out.println("This is the greatest number: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("This is the greatest number: " + num2);
            } else {
                System.out.println("This is the greatest number: " + num3);
            }
        }
    }
}
