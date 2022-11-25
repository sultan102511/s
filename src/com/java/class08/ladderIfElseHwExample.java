package com.java.class08;

import java.util.Scanner;

public class ladderIfElseHwExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter you score: ");
        int score = sc.nextInt();
        if (score > 100){
            System.out.println("Error. Please enter a number between 0 and 100");
        }else if(score < 0) {
            System.out.println("Error. Please enter a number between 0 and 100");
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
        } else if(score >= 0){
            System.out.println("You failed");
        } else {
            System.out.println("Error. Please enter a number between 0 and 100");
        }
    }
}
