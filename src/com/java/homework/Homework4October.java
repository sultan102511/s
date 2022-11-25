package com.java.homework;

import java.util.Scanner;

public class Homework4October {
    public static void main(String[] args) {
        // Write a program to take number from user and print if it's divisible by 5 or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num1 = sc.nextInt();

        if (num1 % 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else {
            System.out.println("The number is not divisible by 5");
        }
    }
}
