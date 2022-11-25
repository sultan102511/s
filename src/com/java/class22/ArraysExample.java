package com.java.class22;
//Arrays - container to hold more than one values of SIMILAR data types
public class ArraysExample {
    public static void main(String[] args) {
        // Declaration of array -
        int data[]; // Declaration will not initialize size in memory
        int a; // 4 bytes

        // Initialize the array
        // Important - in java when we want to initialize variable can hold collection
        // of values we need to use new keyword
        data = new int [5];

        // Declaration and Initialization in same line
        int salary[] = new int[100];

        // Declaration and assignment in the same line
        int numbers [] = {10,20,30,40,50,60,70,80,90,32,12};

        // Length of the Array
        System.out.println(numbers.length);//11 because total amount of numbers is 11

        //Print value at particular index
        System.out.println(numbers[4]); // will print 50 because index starts from 0

        // Print data from array

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        // Print default value of element of array
        System.out.println(salary[45]); // if it's int it will give value 0, if String "null", if boolean = false
        System.out.println(numbers[11]);// Exception, out of bound because the length is 11

    }
}
