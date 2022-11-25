package com.java.codewithmosh;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        // also we can use uppercase and lowercase
        String message = "   Hello \"World\"   " + "!!";
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.trim()); // removes all the spaces from both ends

        // c:\Windows\...
        String message1 = "c: \nWindows\\..."; // \n = new line
        message1 = "c: \tWindows\\...";  // \t = tab

        System.out.println(message1);

        System.out.println("c: \nWindows\\.."); // trim removes whitespace from start and end
        String kick = "     hello world        ";
        System.out.println(kick.trim());

        int a = 3;
        int b = 5;
        String e = "geg3223";
        System.out.println(a+e);





    }
}
