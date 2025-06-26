package com.abhay;

import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a= inp.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }
}
