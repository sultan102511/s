package com.java.homework2ndmonth;

import java.util.Scanner;

public class Homework13 {
    //Task1
    static double celsiusToFahrenheit (double a){
        return a*9/5+32;
    }
    //Task2
    static int findGreatestNumber(int a, int b, int c, int d){
        int greatest =0;
        if(a>b){
            if(a>c){
                if(a>d)
                    greatest =a;
                else
                    greatest =d;
            }
            else{
                if(c>d)
                    greatest =c;
                else
                    greatest =d;
            }
        }else{
            if(b>c){
                if(b>d)
                    greatest =b;
                else
                    greatest =d;
            }
            else{
                if(c>d)
                    greatest =c;
                else
                    greatest =d;
            }
        }
        return greatest;
    }
    static int findMax(int a, int b){
        int maximum= 0;
        if(a>b)
            maximum=a;
        else
            maximum=b;
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task1
        System.out.println("\n\t\t---Task1---");
        System.out.println("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit = " + celsiusToFahrenheit(temp));

        //Task2
        System.out.println("\n\t\t---Task2---");
        System.out.println("Enter four numbers");
        System.out.println("\nFirst number: ");
        int num1 = sc.nextInt();
        System.out.println("Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Third number: ");
        int num3 = sc.nextInt();
        System.out.println("Fourth number: ");
        int num4 = sc.nextInt();
        System.out.println("The greatest number is: "+findGreatestNumber(num1, num2, num3, num4) + "\t(findGreatestNumber method)");
        System.out.println("\nThe greatest number is: "+findMax(findMax(findMax(num1,num2),num3),num4)+"\t(findMax method)");
    }
}
