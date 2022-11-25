package com.java.homework2ndmonth;
// Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3
public class HomeWork19thOctober2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <=50; a++){
            if (a%3 ==0 || a%5==0){
                sum = sum + a;
            }
        }
        System.out.println(sum);

    }
}
