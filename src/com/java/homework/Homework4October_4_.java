package com.java.homework;

import java.util.Scanner;

public class Homework4October_4_ {
    public static void main(String[] args) {
        // Write a program to check given character is vowel or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a character");

        char ch = sc.next().charAt(0);
        while (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " This character is vowel");
             ch = sc.next().charAt(0);
        } if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " This character is vowel");
        } else {
            System.out.println("Please enter a character");
        }
    }
}
