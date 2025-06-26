package com.abhay;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int temp = a;

        int b;
        int count =0;
        while(a>0)
        {
            b=a%10;
            count = count+(b*b*b);
            a=a/10;

        }
        if(count==temp)
        {
            System.out.println("It is armstrong number");
        }
        else {
            System.out.println("It is not a Armstrong number");
        }
    }
}
