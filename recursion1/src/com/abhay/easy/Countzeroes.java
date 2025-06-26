package com.abhay.easy;

public class Countzeroes {
    public static void main(String[] args) {
        int n= 3020004;
        System.out.println(countzero(n,0));

    }
    static int count =0;

    static void reverse1(int n)
    {
        if(n == 0 )
        {
            System.out.println(count);
            return;
        }
        int a = n%10;
        if(a == 0 || n == 0)
        {
            count ++;
        }
        reverse1(n/10);

    }

    static int countzero(int n,int count)
    {
        if(n == 0)
        {
            return count;
        }
        if(n%10 == 0)
        {
            return countzero(n/10,count+1);
        }
        else
        {
            return countzero(n/10,count);
        }
    }


}
