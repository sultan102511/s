package com.java.homework;

import java.util.Scanner;

public class Homework4October_3_ {
    public static void main(String[] args) {
        // Write a program to print messages based on the rating of the company
        Scanner sc = new Scanner(System.in);

        System.out.println("Please rate the service from 1 to 5");
        int rate = sc.nextInt();
        while (rate > 5 || rate < 1) {
            System.out.println("Error. Your rate has to be from 1 to 5");
            rate = sc.nextInt();
        }
        if (rate == 5) {
            System.out.println("Excellent");
        } else if (rate == 4) {
            System.out.println("Great");
        } else if (rate == 3) {
            System.out.println("Good");
        } else if (rate == 2) {
            System.out.println("Bad");
        } else if (rate == 1) {
            System.out.println("Awful");
        }

    }
}
