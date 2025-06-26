package com.abhay;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        //Q: Take input of 2 numbers and print its sum ?
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = in.nextInt();
        System.out.print("Enter Second number: ");
        b = in.nextInt();
        c = a+b;
        System.out.println("The sum of of the two numbers is: " + c);
    }
}
