package com.abhay;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
//        String na = hello();
//        System.out.println("Your name is : " + na);
        int d,e;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        d= in.nextInt();
        System.out.print("Enter Second number: ");
        e = in.nextInt();
        int sum = sum(d,e);
        System.out.println("Sum is :" + sum);


    }
//    static String hello(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = in.nextLine();
//        return name;
//
//    }
    static int sum(int a,int b){
        int c;
        c = a+b;
        return c;

    }
}
