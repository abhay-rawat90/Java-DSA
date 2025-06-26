package com.abhay;

public class Shadowing {
    static int x=90;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x=95;// the  class variable at line 4 is shadowed by this
        System.out.println(x);
        func();

    }

    static void func(){
        System.out.println(x);
    }
}
