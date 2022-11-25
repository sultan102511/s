package com.java.class27;


    class Bank{
        int balance;
        public void method1() {
            balance = 40;
            System.out.println(balance);
        }
    }
public class TypesOfVariable {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.method1();
        System.out.println(b.balance);

    }
}
