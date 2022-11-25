package com.java.homework2ndmonth;

import java.util.Scanner;

// Write a program to print sum of each digit from the given number
// Input - 43634
// Output - 20
public class HomeWork24thOctober1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num !=0){
            sum= sum + num%10;


            num=num/10;
        }System.out.println(sum);

    }
}
