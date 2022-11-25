package com.java.class07;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElseLadderExample2 {
    public static void main(String[] args) {
        // Write a program to take marks from the user and print grade as follow
        // Mark is between 90 to 100 print A+
        // Mark is between 80 to 89 print A
        // Mark is between 70 to 79 print B+
        // Mark is between 60 to 69 print B
        // Mark is between 50 to 59 print C+
        // Mark is between 40 to 49 print C
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter you score; ");
        int score = sc.nextInt();
        if (score > 100){
            System.out.println("Error. Please enter a number between 40 and 100");
        }
        else if (score >= 90 ){
            System.out.println("Your mark is: A+");
        } else if (score >=80 ){
            System.out.println("Your mark is: A");
        }else if (score >=70  ){
            System.out.println("Your mark is: B+");
        }else if (score >=60  ){
            System.out.println("Your mark is: B");
        }else if (score >=50  ){
            System.out.println("Your mark is: C+");
        }else if (score >=40  ){
            System.out.println("Your mark is: C");
        } else {
            System.out.println("Error." + "Please enter a number between 40 and 100");
        }

    }
}
