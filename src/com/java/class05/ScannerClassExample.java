package com.java.class05;

import java.util.Scanner; // Scanner is the class and

public class ScannerClassExample {
    public static void main(String[] args) {
        // important for the practice
        // Creating object of Scanner class

        Scanner sc = new Scanner(System.in);

        System.out.println("Print the first number:");
        int a = sc.nextInt();

        System.out.println("Print the second number:");
        int b = sc.nextInt();

         System.out.println(a + b); // hardcoding

//        System.out.println("How old are you....");
 //       int age = sc.nextInt();
  //      System.out.println("you are " + age);

    }
}
