package com.java.class12;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printLineWithEqual(50);

        System.out.println(" Welcome to the Calculator ");

        printLineWithEqual(50);


        printLineWithHyphen(20);
        System.out.println(" Please enter the first number");
        printLineWithHyphen(20);
        int num1 = sc.nextInt();

        printLineWithHyphen(20);
        System.out.println("Please enter the second number");
        printLineWithHyphen(20);
        int num2 = sc.nextInt();

        printLineWithEqual(40);
        System.out.println("Here is your addition: " + (num1+num2));
        printLineWithEqual(40);


    }
    // Name of the Method - printLineWithEqual
    // Return Type - void
    // Parameter - ()    <-- no Parameter
    // Method Body - System.out.println("==============================");
     static void printLineWithEqual( int length){
         for (int a =1; a <=length ; a++ ) {
             System.out.print("=");
         }
      System.out.println();

    }
    static void printLineWithHyphen(int length){
        for (int i =1; i <= 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
