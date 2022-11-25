package com.java.class06;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        String years = sc.nextLine();
        System.out.println("How many months have you lived?");
        String months = sc.nextLine();
        System.out.println("How many days have you lived?");
        String days = sc.nextLine();
        System.out.println("How many minutes have you lived?");
        String minutes = sc.nextLine();
        String Total = ("You have lived:" + "\n"+ years+ "\n"+ months + "\n" + days +"\n"+ minutes );
        System.out.println(Total);



    }
}
