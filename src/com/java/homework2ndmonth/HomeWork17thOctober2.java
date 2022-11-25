package com.java.homework2ndmonth;

import java.util.Scanner;

// 2. Write a program to find the greatest number out of four numbers using the method
public class HomeWork17thOctober2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int a = sc.nextInt();
        System.out.println("Please enter a number: ");
        int b = sc.nextInt();
        System.out.println("Please enter a number: ");
        int c = sc.nextInt();
        System.out.println("Please enter a number: ");
        int d = sc.nextInt();

         findGreatestNumber(a,b,c,d);


    }
    static void findGreatestNumber(int a, int b, int c, int d){

        if ( a >= b && a >= c && a >= d){
            System.out.println("The greatest number is: " + a );
        }else if (b >= a && b >= c && b >= d){
            System.out.println("The greatest number is: " + b);
        }else if (c >= a && c >= b && c >= d){
            System.out.println("The greatest number is: " + c);
        } else {
            System.out.println("The greatest number is: " + d);
        }


    }
}
