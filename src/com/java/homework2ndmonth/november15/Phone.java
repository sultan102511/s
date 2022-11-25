package com.java.homework2ndmonth.november15;

public class Phone {
    String model;
    int memory;
    double price;
    String currency;
    String totalAmount;

    Phone (String typeOfThePhone) {
        model = typeOfThePhone;
    }
    Phone (int memoryOfThePhone) {
        memory = memoryOfThePhone;
    }
    Phone (double priceOfThePhone, String currencyOfThePrice){
        price = priceOfThePhone;
        currency = currencyOfThePrice;
        totalAmount = price+(price*0.12) + currency;

    }

}
