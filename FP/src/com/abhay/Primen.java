package com.abhay;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Primen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = inp.nextInt();
        String ans = prime(a);
        System.out.println(ans);
    }
    static String prime(int a)
    {
        if(a<=1)
        {
            return("Neither prime nor composite");
        }
        int c=2;
        while(c*c<=a)
        {
            if(a%c==0)
            {
                return("Not prime");
            }
            c+=1;
        }
        return("prime");
    }

}
