package com.java.class30;
class Demo {

        void sum(int a, int b) {

        }

        void sum(double c, int d) {

        }
    }

public class MethodOverloading {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(10,20);
        d.sum(10.3, 10);
    }
}
