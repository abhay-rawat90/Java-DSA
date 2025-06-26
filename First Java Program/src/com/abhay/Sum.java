package com.abhay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter a number 1:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = input.nextInt();
        int c = num1 + num2;
        System.out.println("Sum of the two numbers is:"+ c);
    }
}
