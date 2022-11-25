package com.java.homework2ndmonth;
// Write a program to print the sum of each COLUMN from a 2D array
//         Example
//         Array:
//         {23, 44, 21},
//         {45, 42, 31},
//         {73, 14, 0}
//         Output : Duplicate numbers - 141, 100 ,52
public class HomeWork10thNovember {
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 45, 35},
                {73, 14, 0}
        };
        int sum;
        for (int i =0;i< info.length;i++){
            sum=0;
            for (int j =0;j<info[i].length; j++){
                sum = sum + info[j][i];

            }
            System.out.println(sum);
        }
    }
}
