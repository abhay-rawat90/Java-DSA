package com.abhay.easy;

public class Factorial {
    public static void main(String[] args) {
        int n= 4;
        System.out.println(fact(n));
    }

    static int fact(int n)
    {
        if(n ==1 || n==0 )
        {
            return 1;
        }
        return n * (fact(n-1));



    }
}
