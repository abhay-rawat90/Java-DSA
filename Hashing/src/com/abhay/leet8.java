package com.abhay;

public class leet8 {
    public static void main(String[] args) {
        int n = 499979;
        System.out.println(countPrimes(n));

    }

    public static int countPrimes(int n) {
        if( n == 1 || n==0 || n == 2)
        {
            return 0;
        }
//        if( n == 3)
//        {
//            return 1;
//        }

        int count = 1;
        for (int i = 3; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if( i % j == 0)
                {
                    break;

                }
                if(j == i-1)
                {
                    count ++;
                }

            }
        }

        return count;

    }
}
