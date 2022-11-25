package com.java.homework2ndmonth;
//1.  Write a program to print all the prime numbers from 1 to 100
public class HomeWork26thOctober1 {
    public static void main(String[] args) {
        int dev;
        int count=0;

        for (int a =100; a>=1; a--) {
            for (dev =1; dev<=a;dev++) {
                if (a%dev==0){
                    count++;
                if (count<3){
                    System.out.println(dev);
                }
                }

            }



        }

    }
}
