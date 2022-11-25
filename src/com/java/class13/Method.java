package com.java.class13;

public class Method {

    public static void main(String[] args) {
        int a = 24;
       a=  changeValue(a);
        System.out.println(a);

//        printValue (getSquareOfNumber(25));
    }


    static int changeValue(int a) {
        a = a *5;
        return a;
    }
//    static void printValue(int num) {
//        System.out.println(num);
//    }
//    static int getSquareOfNumber (int a){
//        return getMultiplication(a -a ,a+5);
//    }
//    static int getMultiplication (int c, int b) {
//        return c*b;
//    }

}


