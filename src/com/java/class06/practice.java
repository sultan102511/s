package com.java.class06;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        double a = sc.nextDouble();
        System.out.println("second number");
        double b = sc.nextDouble();
        System.out.println("third number");
        double c = sc.nextDouble();

        double average = (a + b + c)/3 ;

        System.out.println("average is:" + "\n"+ average);

    }
}
