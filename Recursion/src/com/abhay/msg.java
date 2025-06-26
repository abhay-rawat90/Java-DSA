package com.abhay;

public class msg {
    public static void main(String[] args) {
        // write a function, that prints hello world
        message();
    }

    static void message()
    {
        System.out.println("Hello World");
        message1();
    }

    static void message1() {
        System.out.println("Hello World");
        msg2();
    }

    static void msg2(){
        System.out.println("Hello World");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello World");
    }
}
