package com.java.class21;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine();

        String initials = name.charAt(0) + ".";
        for (int i = 0; i <name.length(); i++){
            if (name.charAt(i)== ' '){
                initials = initials + name.charAt(i+1) ;

            }
        }
        System.out.println(initials);
    }
}
