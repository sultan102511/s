package com.java.class05;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a -b;
        a = a -b;
        System.out.println(a);
        System.out.println(b);
        //
        int x = 15, y = 20, c;
        c = x;
        x = y;
        y = c;
        System.out.println(x);
        System.out.println(y);


    }
}
