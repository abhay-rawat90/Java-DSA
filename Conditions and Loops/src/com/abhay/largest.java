package com.abhay;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1:");
        num1 = input.nextInt();
        System.out.print("Enter number 2:");
        num2 = input.nextInt();
        System.out.print("Enter number 3:");
        num3 = input.nextInt();

//        if(num1>num2 && num1>num3 )
//        {
//            System.out.println(num1 +" is largest number");
//        }
//        else if(num2>num1 && num2>num3)
//        {
//            System.out.println(num2 + " is largest number");
//        }
//        else
//        {
//            System.out.println(num3 + " is largest number");
//        }
        int max = num1;
        if(num2>max)
        {
            max = num2;
        }
        if(num3>max)
        {
            max = num3;
        }
        System.out.println(max + " is largest number");
    }
}
