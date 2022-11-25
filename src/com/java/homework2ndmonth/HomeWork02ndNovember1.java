package com.java.homework2ndmonth;

import java.util.Scanner;

//Java Program to count the total number of vowels and consonants in a string
//        Example
//        Input - Today is Saturday
//        Output - Total Vowels - 6, Total Consonants -  9
public class HomeWork02ndNovember1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = sc.nextLine();
        int vowels = 0;
        int cons= 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)== 'a'|| str.charAt(i)== 'e' || str.charAt(i)== 'u'|| str.charAt(i)== 'i' || str.charAt(i)== 'o'){
                vowels++;
            } else if (str.charAt(i)==' '){

            }else {
                cons++;
            }
        }
        System.out.println("Total vowels: "+ vowels);
        System.out.println("Total consonants: " + cons);

    }
}
