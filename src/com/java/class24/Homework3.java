package com.java.class24;

public class Homework3 {
    public static void main(String[] args) {
        int data [] = {43, 44, 37, 37, 43, 43, 44, 17, 44, 44, 17};

        int numbersAlreadyPrinted[] = new int[data.length];

        // Outer for loop - go over each number one by one
        for (int i =0; i < data.length; i++){
            // Inner for loop - go over rest of the numbers starting from number next to the number at position i
            for (int j = i+1; j< data.length; j++){

                // compare each number with rest of the number
                if (data[i] == data[j]){

                    // If it's already printed we don't print
                    if(isThisNumAlreadyPrinted(numbersAlreadyPrinted, data[i])==false){


                        numbersAlreadyPrinted[i+2] = data[i];
                        System.out.println(numbersAlreadyPrinted[i]);
                        break;





                    }

                }
            }
        }
    }
    static boolean isThisNumAlreadyPrinted(int data[] , int targetNumber){

        for ( int i :data ){

            if (data[i] == targetNumber) {

                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
