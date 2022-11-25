package com.java.class06;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your age in years?");
        int years = sc.nextInt();
        System.out.println("Your age in months: " + years * 12);
        System.out.println("Your age in days: " + years *365);
        System.out.println("Your age in minutes: " + years *1440);
    }
}
