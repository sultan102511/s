package com.java.homework2ndmonth;

import java.util.Scanner;

//Write a program to take the full name from the user and print the first letter of the first name and last name
//        Example
//        Input - Thomas Joe
//        Output  - T.J
//        Another Example
//        Input - Charlie Kyle
//        Output - C.K (edited)
public class HomeWork01thNovember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String str = sc.nextLine();

        System.out.println(str.charAt(0) + "." + str.charAt(str.indexOf(' ')+ 1));





    }
}
