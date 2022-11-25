package com.java.homework;

import java.util.Scanner;

// Write a Program To Count Total Number Of Minimum Notes In Given Amount (Notes are of 1, 2, 5, 10, 20, 100 & 500)
//        Example
//        Input  : Amount = 255
//        Output : 2 Notes of 100
//                 2 Notes of 20
//                 1 Note of 10
//                 1 Note of 5
public class HomeWork4October_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the amount");
        int amount = sc.nextInt();

        int note500 = 500;
        int note100 = 100;
        int note20 = 20;
        int note10 = 10;
        int note5 = 5;
        int note2 = 2;
        int note1 = 1;

        if (amount / note500 > 1) {
            System.out.println((amount / 500) + " notes of " + note500);

        } else {
            System.out.println((amount / 500) + " note of " + note500);

            amount = amount % note500;
        }

        if (amount / note100 > 1) {
            System.out.println((amount / note100 + " notes of " + note100));

        } else {
            System.out.println((amount / 100) + "note of " + note500);

        }
        amount = amount % note100;

        if (amount / note20 > 0) {
            System.out.println((amount / 20) + " notes of " + note20);

        } else {
            System.out.println((amount / 20) + "note of " + note500);

        }
        amount = amount % note20;
        if (amount / note10 > 0) {
            System.out.println((amount / 10) + " notes of " + note10);

        } else {
            System.out.println((amount / 10) + "note of " + note500);

        }
        amount = amount % note10;
        if (amount / note5 > 0) {
            System.out.println((amount / 5) + " notes of " + note5);

        } else {
            System.out.println((amount / 5) + "note of " + note500);

        }
        amount = amount % note5;
        if (amount / note2 > 0) {
            System.out.println((amount / 2) + " notes of " + note2);

        } else {
            System.out.println((amount / 2) + "note of " + note500);

        }
        amount = amount % note2;
        if (amount / note1 > 0) {
            System.out.println(amount + " notes of " + note1);
        } else {
            System.out.println((amount + "note of " + note1));

        }


    }
}

