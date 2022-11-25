package com.java.class03;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 2; int b = 4;
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a != b); // true
        System.out.println(a == b); // false

        int c = 5; int d = 5;
        System.out.println(c > d); // false
        System.out.println(c < d); // false
        System.out.println(c >= d); // true
        System.out.println(c <= d); // true
        System.out.println(c != d); // false
        System.out.println(c == d); // true

    }
}
