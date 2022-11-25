package com.java.homework2ndmonth;

public class HomeWork14NovemberMain {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        Dog secondDog = new Dog();

        firstDog.breed = "Great Dane";
        firstDog.age = 3;

        secondDog.breed = "Husky";
        secondDog.age = 2;

        firstDog.findPrice(firstDog.age);
        secondDog.findPrice(secondDog.age);
    }
}
