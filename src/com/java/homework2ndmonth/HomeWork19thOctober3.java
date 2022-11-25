package com.java.homework2ndmonth;
//Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
public class HomeWork19thOctober3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <=10; a++){
            if (a % 3 ==0){
                sum = sum - a;
            } else {
                sum = sum + a;
            }
        }
        System.out.println(sum);

    }
}
