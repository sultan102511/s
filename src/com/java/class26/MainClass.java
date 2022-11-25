package com.java.class26;

public class MainClass {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();

        bmw.speed = 200;
        bmw.color = "White";

        bmw.speed = bmw.increaseSpeed(bmw.speed);

        bmw.decreaseSpeed( bmw);


        bmw.makeSpeedZero();

        System.out.println(bmw.speed);
        System.out.println( audi.color);

    }
}
