package com.java.homework2ndmonth;

// Write Java program to print the sum of even numbers from 1 to 10
public class HomeWork19thOctober1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}
