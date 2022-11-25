package com.java.homework;

import java.util.Scanner;

// Task #1 - Write a program to get a number and print day name as per below mapping
public class HomeworkSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number due to the days of the week");
        int day = sc.nextInt();
        while (day < 0 || day > 8){
            System.out.println("Please enter a valid number : (1-7)");
            day = sc.nextInt();
        }
        switch (day) {
            case 1:
                System.out.println("Sunday");
            break;
            case 2:
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");

        }
    }
}
