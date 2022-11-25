package com.java.class21;

import java.util.Scanner;
// Write a program to print length of the String without .length
public class FIndLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String str = sc.nextLine();
        System.out.println(str.lastIndexOf(""));

        }


    }

