package com.java.homework;

import java.util.Scanner;

// Write a program to get a date of his/her birthday to find out the zodiac sign
public class Homework10thOctober_2_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a month of your birthday: ");
        String month = sc.nextLine();



        if  (!month.matches(month)) {
            System.out.println("Error. Please enter a valid name of the month:");
            month = sc.nextLine();}

        System.out.println("Please enter a day number of your birthday: ");
        int day = sc.nextInt();
          while (day > 31) {

                System.out.println("Error. PLease enter a valid number: ");
                day = sc.nextInt();

            }

            if (month.equalsIgnoreCase("January") && day >= 21 || month.equalsIgnoreCase("February") && day <= 19) {
                System.out.println("Your zodiac sign is Aquarius");

            } else if (month.equalsIgnoreCase("February") && day >= 20 ||month.equalsIgnoreCase("March") && day <= 20) {
                System.out.println("Your zodiac sign is Pisces");

            } else if (month.equalsIgnoreCase("March") && day >= 21 || month.equalsIgnoreCase("April") && day <= 20) {
                System.out.println("Your zodiac sign is Aries");

            } else if (month.equalsIgnoreCase("April") && day >= 21 || month.equalsIgnoreCase("May") && day <= 21) {
                System.out.println("Your zodiac sign is Taurus");

            } else if (month.equalsIgnoreCase("May") && day >= 22 || month.equalsIgnoreCase("June") && day <= 21) {
                System.out.println("Your zodiac sign is Gemini");

            } else if (month.equalsIgnoreCase("June") && day >= 22 || month.equalsIgnoreCase("July") && day <= 22) {
                System.out.println("Your zodiac sign is Cancer");

            } else if (month.equalsIgnoreCase("July") && day >= 23 || month.equalsIgnoreCase("August") && day <= 21) {
                System.out.println("Your zodiac sign is Leo");

            } else if (month.equalsIgnoreCase("August") && day >= 22 || month.equalsIgnoreCase("September") && day <= 23) {
                System.out.println("Your zodiac sign is Virgo");

            } else if (month.equalsIgnoreCase("September") && day >= 24 || month.equalsIgnoreCase("October") && day <= 23) {
                System.out.println("Your zodiac sign is Libra");

            } else if (month.equalsIgnoreCase("October") && day >= 24 || month.equalsIgnoreCase("November") && day <= 22) {
                System.out.println("Your zodiac sign is Scorpio");

            } else if (month.equalsIgnoreCase("November") && day >= 23 || month.equalsIgnoreCase("December") && day <= 22) {
                System.out.println("Your zodiac sign is Sagittarius");

            } else if (month.equalsIgnoreCase("December") && day >= 23 || month.equalsIgnoreCase("January") && day <= 20) {
                System.out.println("Your zodiac sign is Capricorn");
            }
        }



}


