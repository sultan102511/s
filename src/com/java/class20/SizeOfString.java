package com.java.class20;

import java.util.Scanner;

// Write a program to take String from user using scanner class
// Count the number of spaces from the String
// Print String is small if number of spaces less than 5
// Print String is medium if number of spaces greater than or equal to 5 and less than 10
// Print String is large if number of spaces greater than ten
public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your address");
        String str = sc.nextLine();

        System.out.println(countSpaces(str));
    }
  static int countSpaces(String str){
        int count = 0;
        for (int j=0; j<str.length(); j++ ){
            if (str.charAt(j) == ' '){
                count++;
            }

        }

        return count;
    }
}
