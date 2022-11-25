package com.java.class07;

import java.util.Scanner;

public class ifElseExample2 {
    public static void main(String[] args) {
        // Write a program to take age from user and print weather they are eligible for driving licence or not
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int a = sc.nextInt();
        if (a >=16) {
            System.out.println("You're old enough to get a driver licence");
        } else {
            System.out.println("Sorry, but you're not old enough to get a driver licence");
        }
    }
}
