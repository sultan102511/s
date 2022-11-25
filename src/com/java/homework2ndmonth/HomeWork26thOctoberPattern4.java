package com.java.homework2ndmonth;
//    1
//   000
//  11111
// 0000000
//111111111
// 0000000
//  11111
//   000
//    1
public class HomeWork26thOctoberPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i ++) {
            for (int s = 1; s <= 5 - i; s++){
                System.out.print(" ");
            }
                for (int j = 1; j <= i * 2 - 1; j++) {

                    System.out.print(i % 2);

                }

            System.out.println();
        }
        for (int i = 1; i<=4; i++){
            for (int s = 1; s <=i;s++){
                System.out.print(" ");
            }
            for (int j =1; j<=9-i*2; j++){
                System.out.print((i+1)%2);
            }
            System.out.println();
        }
    }
}

