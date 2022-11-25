package com.java.homework;

import java.util.Scanner;
// Write a program to print a given number that is positive, negative or zero
public class homeWork10_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number:");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("The number is positive");
        } else if (num == 0){
            System.out.println("The number is zero");
        } else if (num < 0 ){
            System.out.println("The number is negative");
        }
    }
}
