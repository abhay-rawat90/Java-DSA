package com.abhay;

import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num1 = inp.nextInt();
        int r;
        int ans = 0;
//        while(num1>0)
//        {
//            r = num1%10;
//            System.out.print(r);
//            num1=num1/10;
//
//        }
        while(num1>0)
        {
            r=num1%10;
            ans = ans*10+r;
            num1 =num1/10;

        }
        System.out.println("Reverse of the number entered is: "+ans);

    }
}
