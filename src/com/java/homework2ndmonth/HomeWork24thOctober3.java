package com.java.homework2ndmonth;
// Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
public class HomeWork24thOctober3 {
    public static void main(String[] args) {
        double sum = 0;
        for (double num = 1; num <= 10; num++) {
            sum = sum + num / (num + 1);


        }System.out.println(sum);
    }
}
