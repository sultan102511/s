package com.java.class16;

import java.util.Scanner;

public class FindMaxOutOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num % 10;// max=6
        while (num >0){
            if (num %10 >= max) {
                max = num%10;
            }
            num = num/10;

        } System.out.println(max);
        }
    }

