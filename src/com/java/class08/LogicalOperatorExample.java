package com.java.class08;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        // Logical operator works with boolean value
        boolean b1 = true, b2 = false, b3 = true;
        System.out.println(b1 || b2);
        System.out.println(b1 || b2 && b3);
        System.out.println(b1 && b2 || b3);
    }
}
