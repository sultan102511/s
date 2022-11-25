package com.java.codewithmosh;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0) + "." + s.charAt(s.indexOf(' ')+ 1));
    }
}
