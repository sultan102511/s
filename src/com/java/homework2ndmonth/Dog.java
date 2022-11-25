package com.java.homework2ndmonth;

public class Dog {
    // class
    String breed;
    String color;
    double age;
    String name;
    double price;
    void breedName (String breed){
        System.out.println(breed);

    }
    void findColor(String color){
        System.out.println(color);
    }
    void findPrice(double age){
        if (age >= 3){
            System.out.println("The price is: " + 1000 + "$");
        } else {
            System.out.println("The price is: " + 2000 + "$");
        }
    }



}
