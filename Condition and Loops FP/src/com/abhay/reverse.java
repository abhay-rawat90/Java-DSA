package com.abhay;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int b;
        int ans = 0;
//        while(n>0)
//        {
//            b=n%10;
//            n=n/10;
//            System.out.print(b);
//        }
        while(n>0)
        {
            b=n%10;
            ans=ans*10+b;
            n=n/10;
        }
        System.out.println(ans);
    }
}
