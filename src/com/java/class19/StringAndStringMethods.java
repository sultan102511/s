package com.java.class19;

public class StringAndStringMethods {
    public static void main(String[] args) {
        String object1 = "Hello";
        String object2 = "Hello";
        //object1 = "Bye Bye";
        String object3 = new String("Hello");
        String object4 = new String("Hello");

        System.out.println(object1 == object2);
        System.out.println(object1 == object3);
        System.out.println(object3 == object4);
        // '==' compare address of the memory instead of content
        // .equals compare the content of the String
    }
}
