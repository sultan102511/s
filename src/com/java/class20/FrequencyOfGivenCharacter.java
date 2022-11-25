package com.java.class20;

import java.util.Scanner;

public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentences");
        String str = sc.nextLine();
        System.out.println(countFrequency(str));

    }
    static int countFrequency(String str){
        int count =0;
        char target = 'e';
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == target){
                count++;
            }
        }
        return count;
    }
}
