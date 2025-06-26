package com.abhay.easy;

public class reverse {
    static int sum = 0;

    static void reverse2(int n)
    {
        if(n == 0)
        {
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverse2(n/10);

    }
    public static void main(String[] args) {
        int n= 54678;
        System.out.println(rev3(n));
    }

    static void reverse1(int n)
    {
        if(n/10 < 1 )
        {
            System.out.print(n);
            return;
        }
        int a = n%10;
        System.out.print(a);
        reverse1(n/10);

    }

    static int rev3(int n)
    {
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    static int helper(int n, int digits)
    {
        if(n%10 == n)
        {
            return n;
        }
        int rem = n%10;
        return rem *(int) Math.pow(10,digits-1) + helper(n/10,digits-1);
    }


}
