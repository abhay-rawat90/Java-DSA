package com.abhay.easy;

public class Palindrome {
    public static void main(String[] args) {
        int n= 121;
        System.out.println(pal(n));
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

    static boolean pal(int n)
    {
        if(n == rev3(n))
        {
            return true;
        }
        return false;
    }


}
