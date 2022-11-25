package com.java.class11;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Use Operation from 1 to 4");
        }
    }
}