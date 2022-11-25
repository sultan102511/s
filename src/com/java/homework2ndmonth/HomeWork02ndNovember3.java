package com.java.homework2ndmonth;

import java.util.Scanner;

// Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
//         Example
//         Input - Was it a car or a cat I saw
//         Output - Palindrome
public class HomeWork02ndNovember3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to check if it's palindrome or not");
        String str = sc.nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        str = str.replaceAll(" ", "");
        rev = rev.replaceAll(" ", "");
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("The String is palindrome");
        } else {
            System.out.println("The String is not palindrome");
        }
    }
}
