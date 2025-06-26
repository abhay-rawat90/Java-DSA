package com.abhay;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        if(num1%2 == 0)
        {
            System.out.println("Entered number is even");
        }
        else
        {
            System.out.println("Entered number id odd");
        }
    }
}
