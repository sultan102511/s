package com.java.class21;

import java.util.Scanner;

public class FindReverseOfGivenString {
    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your first and last name");
            String str = sc.nextLine();
            String rev ="";
            for (int i = 0; i < str.length(); i++){
                rev = str.charAt(i) +rev;

            }
        System.out.println(rev);

          // another approach
        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(str.length()-1-i));
        }
        }
    }
