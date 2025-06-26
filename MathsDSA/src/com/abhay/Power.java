package com.abhay;

public class Power {
    public static void main(String[] args) {
        int n = 6;
        int base = 2;
        int ans =1;
        while(n>0)
        {
            int a = n & 1;
            if(a == 0){
                n = n>>1;
                base = base * base;
            }
            if(a == 1)
            {
                ans = ans * base;
                base = base * base;
                n = n>>1;
            }




        }
        System.out.println(ans);
    }
}
