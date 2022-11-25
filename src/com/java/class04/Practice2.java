package com.java.class04;

public class Practice2 {
    public static void main(String[] args) {
        // input 40, 20, 55; output 40;
        // find out the maximum;
        int a = 40, b = 20, c = 55;
        if(c > b && c > a) {
            System.out.println(a);
        } else if(b > a) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
        // input - 10 & 20   Add    output = 30
        // input - 10 & 20   mul    output = 200
        int x = 10, y = 20;
        String operation = "sub";
        switch (operation) {
            case "add":
                System.out.println(x + y);
                break;
            case "sub":
                System.out.println(x - y);
                break;
            case "mul":
                System.out.println(x * y);
                break;
            case "div":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Error");
        }

    }
}
