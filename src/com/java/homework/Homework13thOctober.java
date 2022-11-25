package com.java.homework;
// Write a program to take three numbers from user and find reverse of the greatest number (3 digit number)

import java.util.Scanner;

public class Homework13thOctober {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number (100-999) : ");
        int num1 = sc.nextInt();
        num1 = checkNumber(num1);


        System.out.println("Please enter the second number (100-999) : ");
        int num2 = sc.nextInt();
        num2 = checkNumber(num2);

        System.out.println("Please enter the third number (100-999) : ");
        int num3 = sc.nextInt();
        num3 = checkNumber(num3);

        int reverse = 0;
        findTheGreatestAndReverse(num1, num2, num3, reverse);


    }

    static void findTheGreatestAndReverse(int a, int b, int c, int r) {

        if (a > b && a > c) {
            System.out.println("The greatest number is : " + a);

            getReverse(a, r);

            System.out.println("The reverse of the greatest number is: " + r);
        } else if (b > c) {
            System.out.println("The greatest number is : " + b);
            getReverse(b, r);

            System.out.println("The reverse of the greatest number is: " + r);
        } else {
            System.out.println("The greatest number is : " + c);

            getReverse(c, r);
            System.out.println("The reverse of the greatest number is: " + r);
        }


    }

    static int checkNumber(int x) {
        Scanner sc = new Scanner(System.in);
        while (x < 99 || x > 999) {
            System.out.println("Error. Enter a valid number");
            x = sc.nextInt();

        }
        return x;
    }

    static void getReverse(int a, int b) {
        while (a > 0) {
            b = b * 10 + a % 10;
            a = a / 10;


        }
        System.out.println(b);
    }
}

