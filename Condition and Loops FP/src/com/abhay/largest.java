package com.abhay;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = in.nextInt();
        System.out.println("Enter Second number: ");
        int b = in.nextInt();
        System.out.println("Enter the Third number: ");
        int c = in.nextInt();
        if(a>b &&  a>c)
        {
            System.out.println(a + " is the largest number");
        }
        else if (b>a && +b>c)
        {
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(c + " is the largest number");
        }


    }
}
