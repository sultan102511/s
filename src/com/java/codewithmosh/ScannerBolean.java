package com.java.codewithmosh;

import java.util.Scanner;

public class ScannerBolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you 18 years old?");

        boolean first;
        first = sc.nextBoolean(); // if we put hasNextBoolean, it looks if the next value from the Scanner is of a boolean type
        //boolean second = sc.hasNextBoolean();
        if (first) {
            System.out.println("Yes, you can buy tobacco products");
        } else {
            System.out.println("No, you cannot buy tobacco products");
        }





    }
}
