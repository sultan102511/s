package com.java.homework2ndmonth;
//2.    Write a program to find a magic number from 1 to 100,
//        if you divide that number by 5 you will get reminder 4
//        if you divide that number by 4 you will get reminder 3
//        if you divide that number by 3 you will get reminder 2
//        if you divide that number by 2 you will get reminder 1
public class HomeWork26thOctober2 {
    public static void main(String[] args) {
        for (int num = 1; num<=100;num++){
            if (num%5==4 && num%4 ==3 && num%3==2 && num%2==1){
                System.out.println(num);
            }
        }

    }
}
