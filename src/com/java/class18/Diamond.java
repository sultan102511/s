package com.java.class18;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for (int i = 1; i<=num1/2+1; i++){
            for (int space =1; space <=num1-i;space++ ) {
                System.out.print(" ");
            }
            for (int a = 1; a <=i*2-1; a++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int a = num1/2; a>=1; a--){
            for (int sp = 1; sp<=num1-a; sp++){
                System.out.print(" ");
            }
            for (int l = 1; l <= a*2-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
