package com.java.homework2ndmonth;

import java.util.Scanner;

//Java Program to remove all the white spaces from a string
//        Example
//        Input - Today is Saturday
//        Output - TodayisSaturday
public class HomeWork02ndNovember2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)== ' '){
                str = str.replaceAll(" ", "");
            }

        } System.out.println(str);




    }
}
