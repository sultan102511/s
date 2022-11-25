package com.java.class24;

public class SumOfElementRowWise {
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };
        int result = 0;
        for (int i = 0; i < info.length; i++) {
            result =0;
            for (int j = 0; j < info[i].length; j++) {

                result = result + info[i][j] ;

            }System.out.println(result + " ");

        }
            int data[][] = {
                    {23, 44, 21},
                    {45, 42, 31},
                    {73, 14, 0}
            };

            int sum = 0;

            for (int i = 0; i < data.length; i++) {

                sum = 0;
                for (int j = 0; j < data[i].length; j++) {
                    sum = sum + info[i][j];
                }
                System.out.println(sum + "sula");
            }
        }
    }

