package com.abhay;

public class HcfandLcm {
    public static void main(String[] args) {
        System.out.println(gcd(2,7 ));
        System.out.println(lcm(2,7));

    }

    static int gcd(int a , int b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a,int b)
    {
        int l = (a*b)/gcd(a,b);
        return l;
    }
}
