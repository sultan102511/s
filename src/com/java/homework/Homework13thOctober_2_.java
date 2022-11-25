package com.java.homework;

import java.util.Scanner;

public class Homework13thOctober_2_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();
        findOutOddEvenNumber(num1);
    }
    static int findOutOddEvenNumber (int a ){
        if ( a % 2 == 0){
            System.out.println("The number is even: " + a);
        } else {
            System.out.println("The number is odd: " + a);
        }

        return a;
    }
}
