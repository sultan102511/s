package com.java.homework;

import java.util.Scanner;

public class Homework29_09first {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        System.out.println("Please type a number");
//        int a = sc.nextInt()
//        System.out.println("The square of the number is:"+ "\n" + a*a);
 //       System.out.println("Please type the principle: ");
   //     double price = sc.nextDouble();
   //     System.out.println("Please type the rate interest:");
    //    double ri = sc.nextDouble();
    //    System.out.println("Please type the number of years:");
     //   double years = sc.nextDouble();
     //   System.out.println("The simple interest is:" +"\n" + (price * ri * years)/100 );
        System.out.println("Please type the value of the item:");
        double price = sc.nextDouble();
        System.out.println("Please type the discount percentage:");
        double dis = sc.nextDouble();
        System.out.println("This is the price of the item after discount" + "\n" + (price -price *dis/100));

    }
}
