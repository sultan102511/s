package com.java.homework2ndmonth;

import java.util.Scanner;

// 4.  Write a program to find factors of the given number
//Input - 6
//Output - 1 2 3 6
public class HomeWork24thOctober4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors;

        for (factors = 1; factors <= num; factors++) {
            if (num % factors == 0) {
                System.out.println(factors);
            }
        }

    }

}

