package com.java.homework2ndmonth;
//. Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
//Example
//Input : 5, 2, 8, 7, 3, 6
//Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
public class HomeWork09November2 {
    public static void main(String[] args) {
        int data [] = {5, 2, 8, 7, 3, 6};

        for (int i = 0; i<data.length; i++){

            for (int j = i+1; j < data.length; j++){
                if (data[i] > data[j]){
                    int move = data[i];
                    data[i]=data[j];
                    data[j]=move;

                }
            }

        }
        for (int num : data){
            System.out.println(num);
        }


    }
}
