package com.java.class10;

public class IfElseRevisionExample1 {
    public static void main(String[] args) {
        int i = 10, j = 20;
        if (i <=10 && j > i || j <=i) {
            j = j +30;
        } else {
            i = i + 30;
        }
        if (i>j){
            i = i +j;
        } else {
            j= i + j;
        }
        System.out.println(i);
        System.out.println(j);
    }
}
