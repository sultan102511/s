package com.java.class05;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("My first name is:");
        String word1 = sc.nextLine();
        System.out.println("My last name is:");
        String word2 = sc.nextLine();
        System.out.println(word1 + " " + word2);

    }
}
