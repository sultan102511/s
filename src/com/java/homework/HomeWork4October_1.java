package com.java.homework;

import java.util.Scanner;

// Write a program to get a year from the user and check whether it's a leap year or not
// Example:
// Input : Year = 2000
// Output : Leap year
public class HomeWork4October_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a year:");
        int year = sc.nextInt();
        while (year < 0) {
            System.out.println("Error. Please enter a valid number");
            year = sc.nextInt();
        }
        if (year % 4 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }

    }
}
