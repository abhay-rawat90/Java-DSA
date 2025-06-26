package com.abhay;

import java.util.Scanner;

public class ibit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary Number:");
        int a = in.nextInt();
        System.out.print("Enter the bit no.:");
        int b = in.nextInt();
        int c = bit(a,b);
        System.out.println(c);

    }

    static int bit(int n,int k)
    {
        int d = n & (1<<(k-1));
       return d;
    }
}
