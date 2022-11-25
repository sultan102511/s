package com.java.class29;
// you can call Constructor from another Constructor only
// You can call a constructor from another constructor , but it has to be called in the first line only
class Bank1 {


    Bank1 (int balance){

        System.out.println("from Bank" + balance);
    }


}
class CitiBank extends Bank1{

    CitiBank () {
        super(10);
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        CitiBank b= new CitiBank();
    }
}
