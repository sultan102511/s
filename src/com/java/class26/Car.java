package com.java.class26;

public class Car {
    int speed = 200;
    String color = "white";
    void drive(){
        System.out.println("Driving " + color+ " car at speed" + speed);
    }
    // Pass by value
    int increaseSpeed(int speed){
        speed = speed+500;
        return speed;
    }
    // Pass by reference
    void decreaseSpeed(Car myCar){
        myCar.speed = myCar.speed-200;
        myCar.color = "black";
        color = "Yello";



    }
    void makeSpeedZero (){
        speed = 0;
    }
}
