package com.java.class07;

import java.util.Scanner;

public class ifElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type first number:");
        int a = sc.nextInt();
        System.out.println("Please type second number:");
        int b = sc.nextInt();
        if (a >b) {
            System.out.println("The maximum number is : " + a);
        } else {
            System.out.println("The maximum number is : " + b);
        }

    }
}
