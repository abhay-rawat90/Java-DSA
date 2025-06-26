package com.abhay;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        int a = in.nextInt();
        eo(a);

    }

    static void eo(int n)
    {
        if((n & 1) == 1)
        {
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
