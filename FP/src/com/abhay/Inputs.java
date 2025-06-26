package com.abhay;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter your name:");
        String a = inp.nextLine();
        System.out.println("Your name is " + a);
        System.out.print("Enter your roll no. :");
        int b = inp.nextInt();
        System.out.println("Your Roll no. is : " + b);

    }
}
