package com.abhay;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int a;// print numbers form 1 to n
        System.out.print("Enter the Value of n :");
        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();
        for(int i =1;i<=a;i++)
        {
            System.out.println(i);
        }
    }
}
