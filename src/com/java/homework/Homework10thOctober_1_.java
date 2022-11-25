package com.java.homework;

import java.util.Scanner;

// Write a program to get a 3 digits number from a user (from 100 to 999 only)
// and print reverse of the number in the output
public class Homework10thOctober_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter a 3 digits number: ");
        int num = sc.nextInt();
        while (num <100 || num > 1000){
            System.out.println("Error. Please try again");
            num = sc.nextInt();
        }
        int reverse = 0;
        while (num > 0) {
            reverse = reverse*10 + num%10; // 32
            num= num/10;
        }
        System.out.println(reverse);
    }
}
