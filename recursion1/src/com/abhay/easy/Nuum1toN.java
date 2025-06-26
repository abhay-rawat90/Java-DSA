package com.abhay.easy;

public class Nuum1toN {
    public static void main(String[] args) {
        int n = 20;
        int p =1;
        nto1new(n);
    }

    static void nto1(int n,int p)
    {
        if(p == n)
        {
            System.out.print(n);
            return;
        }
        System.out.print(p + " ");
        nto1(n,p+1);
    }

    static void nto1new(int n)
    {
        if(n == 1)
        {
            System.out.print(1 + " ");
            return;
        }
        nto1new(n-1);
        System.out.print(n + " ");
    }

}
