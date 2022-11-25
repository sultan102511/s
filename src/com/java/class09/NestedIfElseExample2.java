package com.java.class09;
// Get salary and age from user
// 1. if age is less than 18 then print You're not eligible
// 2. age is more than or equal 18 and salary is less than 5000
// then print "Sorry, you need to work hard to get credit card"
// 3. If age is more than or equal 18 and salary is greater than or equal to 5000 then print you are eligible
// 4. If age is more than or equal 18 and salary is greater than or equal to 20000 then print
// you will get free credit card

import java.util.Scanner;

public class NestedIfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        double age = sc.nextDouble();
        System.out.println("Please enter your salary: ");
        double slr = sc.nextDouble();
        if (age >= 18) {
            if (age >= 18 && slr >= 20000) {
                System.out.println("You will get a free credit card");
            } else if (slr >= 5000) {
                System.out.println("You're eligible");
            } else {
                System.out.println("Work hard");
            }

        } else {
            System.out.println("You're not eligible");
        }

    }

}