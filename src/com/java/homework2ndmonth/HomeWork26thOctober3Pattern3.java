package com.java.homework2ndmonth;
//       1
//        123
//       12345
//      1234567
//     123456789
public class HomeWork26thOctober3Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i<=5;i++){
            for (int s = 1; s <= 5-i; s++){
                System.out.print(" ");
            }
            for (int j =1; j <=i*2-1; j++ ){
                System.out.print(j);
            }
            System.out.println();}

    }
}
