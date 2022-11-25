package com.java.homework2ndmonth;

import java.util.Scanner;

//Write a program to print each digit of the number into a separate line in reverse order
//        Example
//        Input - 3575
//        Output
//        5
//        7
//        5
//        3
public class HomeWork19thOctober4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse;
        int a = sc.nextInt();
        while (a>0){
            reverse = a%10;
            a = a/10;
            System.out.println(reverse);
        }

    }
}
