package com.java.class29;
class Vehicle{
    int speed = 50;
    Vehicle() {
        System.out.println(speed);
    }
    void drift (){
        System.out.println("Drifting run");
    }
}
// this - it refers to current class object
    class Car extends Vehicle{
    int speed = 100;

    void drift(){
            int speed = 200;
            System.out.println(speed); // 200
            System.out.println(this.speed);//100
            super.drift();
        System.out.println(super.speed);
       // drift(); // the process of calling the function itself called Recursion
        }
    }
public class ThisAndSuperExample {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speed);//100
        System.out.println();
        c.drift();



    }
}
