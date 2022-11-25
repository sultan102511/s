package com.java.homework;

import java.util.Scanner;

public class homeWork10_03second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number from 1 to 12:");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error. Please enter a number from 1 to 12");
        } else if (num == 1) {
            System.out.println("The number of days in this month is: 31");
        } else if (num == 2) {
            System.out.println("The number of days in this month is: 28");
        }else if (num == 3) {
            System.out.println("The number of days in this month is: 31");
        }else if (num == 4) {
            System.out.println("The number of days in this month is: 30");
        }else if (num == 5) {
            System.out.println("The number of days in this month is: 31");
        }else if (num == 6) {
            System.out.println("The number of days in this month is: 30");
        }else if (num == 7) {
            System.out.println("The number of days in this month is: 31");
        }else if (num == 8) {
            System.out.println("The number of days in this month is: 31");
        }else if (num == 9) {
            System.out.println("The number of days in this month is: 30");
        }else if (num == 10) {
            System.out.println("The number of days in this month is: 31");
        }else if (num == 11) {
            System.out.println("The number of days in this month is: 30");
        }else if (num == 12) {
            System.out.println("The number of days in this month is: 31");
        } else if (num > 12){
            System.out.println("Error.Please enter a number from 1 to 12" );
        }
    }
}
