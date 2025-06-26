package com.abhay;

import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        int b;
        while (n>0)
        {
            b=n%10;
            if(b==7)
            {
                a++;
            }
            n=n/10;

        }
        System.out.println(a);
    }
}
