package com.abhay;

public class overloading {
    public static void main(String[] args) {
        ol(24);

    }
    static void ol(int a){
        System.out.println(a);
    }

    static void ol(String name)
    {
        System.out.println(name);
    }
}

