package com.java.homework2ndmonth;
// Write a program to print numbers from 1 to 20 which are divisible by 3

public class HomeWork18thOctober2 {
    public static void main(String[] args) {
        int num =1;
        while (num<=20){
            if (num % 3 ==0){
                System.out.println(num);
            }
            num++;
        }
    }
}
