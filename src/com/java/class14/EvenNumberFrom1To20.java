package com.java.class14;

// use while loop
public class EvenNumberFrom1To20 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 20) {

            if (a % 2 == 0) {
                System.out.println(a);

            }
            a++;
        }
    }
}
