package com.java.class17;

import java.util.Scanner;

public class NestedForLoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num -2;
        for (int a = 1; a <= num-3; a++) {

            for (int space = 1; space < num - a; space++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a * 2 - 1; c++) {

                System.out.print("A");
            }
            System.out.println();
        }


        for (int a = 1; a<=num/2+1;a++){
            for (int s =1; s<=a/2+3; s++){
                System.out.print(" ");
            }
            for (int t = num; t<=num+a; t--){
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
