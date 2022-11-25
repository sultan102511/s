package com.java.class12;

import java.util.Scanner;

public class FindReverseOfNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number (100-999): ");
        int num = sc.nextInt();
        int reverse = 0;
        getReverse(num, reverse);
    }
    static void getReverse(int a, int r ){
        Scanner sc = new Scanner(System.in);
        while (a<100 || a >999) {
            System.out.println("Error. Please enter a valid number");
            a = sc.nextInt();
        }
        while (a>0){
            r= r*10 + a%10;
            a= a/10;
        }
        System.out.println(r);
    }
}
