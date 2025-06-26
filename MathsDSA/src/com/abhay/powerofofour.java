package com.abhay;

public class powerofofour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1162261466));

    }
    static boolean isPowerOfFour(int n) {
        double a= 1;
        if(n ==1 )
        {
            return true;
        }
        while(a < n)
        {
            a= a*4;
            if(a == n)
            {
                return true;
            }
        }
        return false;


    }
}
