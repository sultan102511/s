package com.java.homework2ndmonth.november15;

public class MainPhone {
    public static void main(String[] args) {
        Phone phoneType = new Phone("Iphone");
        Phone memory = new Phone(128);
        Phone price = new Phone(999,"$");

        System.out.println(phoneType.model);
        System.out.println(memory.memory + "GB");
        System.out.println(price.totalAmount);
    }
}
