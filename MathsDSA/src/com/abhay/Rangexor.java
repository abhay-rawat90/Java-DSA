package com.abhay;

public class Rangexor {
    public static void main(String[] args) {
        int n =9;
        int a = 3;
        System.out.println(xor(n)^xor(a-1));

    }
    static int xor(int a ){
        if(a % 4 == 0)
        {
            return a;
        }
        if(a % 4 == 1)
        {
            return 1;
        }
        if(a % 4 == 2)
        {
            return a+1;
        }
        if(a % 4 == 3)
        {
            return 0;
        }
        return -1;
    }
}

