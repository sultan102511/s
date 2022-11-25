package com.java.homework;

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount: ");
        int amount = sc.nextInt();

        int result = (amount / 500);
        if(result > 1) {
            System.out.println(result+" notes of 500");

        } else if (result ==1){
            System.out.println(result + " note of 500");
        }amount = amount % 500;

        result = (amount / 100);
        if(result > 1) {
            System.out.println(result+" notes of 100");

        } else  if (result == 1){
            System.out.println(result + " note of 100");
        }amount = amount % 100;

        result = (amount / 20);
        if(result > 1) {
            System.out.println(result+" notes of 20");

        } else if (result ==1){
            System.out.println(result + " note of 20");
        }amount = amount % 20;

        result = (amount / 10);
        if(result > 1) {
            System.out.println(result+" notes of 10");

        } else if (result ==1){
            System.out.println(result + " note of 10");
        }amount = amount % 10;

        result = (amount / 5);
        if(result > 1) {
            System.out.println(result+" notes of 5");

        } else if (result ==1){
            System.out.println(result + " note of 5");
        }amount = amount % 5;

        result = (amount / 2);
        if(result > 1) {
            System.out.println(result+" notes of 2");

        }else if (result ==1) {
            System.out.println(result + " note of 2");
        }amount = amount % 2;

        if(amount > 1) {
            System.out.println(amount +" notes of 1");
        }else if (result == 1){
            System.out.println(result + " note of 1");
        }
    }
}
