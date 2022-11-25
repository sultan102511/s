package com.java.homework;

import java.util.Scanner;

public class Homework4October_2_ {
    public static void main(String[] args) {
        // Write a program to calculate the final bill of the customer after giving discount based on the amount
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your bill:");

        int bill = sc.nextInt();
        if (bill >= 10000) {
            System.out.println("Your final bill after 20% discount will be:" + (bill * 0.8));
        } else if (bill >= 5000) {
            System.out.println("Your final bill after 15% discount will be:" + (bill * 0.85));
        } else if (bill >= 2000) {
            System.out.println("Your final bill after 10% discount will be:" + (bill * 0.9));
        } else if (bill >= 1000) {
            System.out.println("Your final bill after 5% discount will be:" + (bill * 0.95));
        } else if (bill < 0){
            System.out.println("Error");
        }else {
            System.out.println("Your final bill is:" + bill);
        }
    }
}
