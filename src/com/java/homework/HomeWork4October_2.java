package com.java.homework;

import java.util.Scanner;

// Write a program to read power consumed in units and print the amount to be paid by the customer
// If unit is 0-200       Rs.0.50 per unit
// If unit is 201-400     Rs.100 plus Rs.0.65 per unit
// If unit is 401-600     Rs.230 plus Rs.0.80 per unit
public class HomeWork4October_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of units:");
        double units = sc.nextDouble();
        while (units <= 0 || units > 600) {
            System.out.println("Please enter correct number");
            units = sc.nextDouble();
        }
        if ( units <=200) {
            System.out.println("Your power bill is: " + "\n" + (units*0.50));
        } else if (units <= 400) {
            System.out.println("Your power bill is: " + "\n" + (units*0.65+100));
        } else if (units <= 600) {
            System.out.println("Your power bill is: " + "\n" + (units*0.80+100));
        }

    }
}
