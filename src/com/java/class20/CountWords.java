package com.java.class20;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i)== ' '){
                count ++;
            }
        }
        System.out.println(count + 1);
    }
}
