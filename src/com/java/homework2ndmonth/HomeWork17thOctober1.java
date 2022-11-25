package com.java.homework2ndmonth;

import java.util.Scanner;

// Write a program to take a temperature from the user in celsius and convert it into Fahrenheit  using the method
public class HomeWork17thOctober1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a temperature outside in celsius: ");

        double celsius = sc.nextDouble();
        System.out.println("This is the temperature in Fahrenheit: " + findTemperatureInFahrenheit(celsius)+ "F");

    }
    static double findTemperatureInFahrenheit ( double fahrenheit){
        fahrenheit = fahrenheit * 9/5 +32;
        return fahrenheit;
    }
}
