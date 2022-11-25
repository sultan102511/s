package com.java.homework2ndmonth;
//2. Write a program to find all duplicates number from the array
// (Implement this program to get unique numbers in the output)
//Example
//Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//Output : Duplicate numbers - 23, 44, 35
public class HomeWork09November1 {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        for (int i = 0; i < data.length; i++){
            int num =0;
            for (int j = i+1; j < data.length; j++) {
                    if (data[i] == data[j]){
                        num++;


                    }

            }
            if (num == 1){
                System.out.print(data[i] +", ");

            }

        }




    }
}
