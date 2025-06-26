package com.abhay;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = in.nextInt();
        int count =2;
        while(count<=c)
        {
            int temp=b;
            b=b+a;

            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
