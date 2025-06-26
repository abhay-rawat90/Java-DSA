package com.abhay.easy;

public class Productofdigits {
    public static void main(String[] args) {
        int n =55;
        System.out.println(prod(n));
    }

    static int prod(int n)
    {
        if(n%10 == n)
        {
            return n;
        }
        return n%10 * prod(n/10);
    }
}
