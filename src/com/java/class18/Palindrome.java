package com.java.class18;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ON= num;
        int rev=0;
        while(num>0){
            rev = rev*10 + num%10;
            num = num/10;

        } System.out.println(rev);

            if (ON !=rev){
                System.out.println("not palindrome");
            }else{
                System.out.println("palindrome");
            }
    }
}
