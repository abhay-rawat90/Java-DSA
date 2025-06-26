package com.abhay;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        System.out.print("Enter a Number:");
//        int a = inp.nextInt();
//        an(a);
        for (int i = 100; i < 1000 ; i++) {
            if(an(i))
            {
                System.out.println(i+ " ");
            }

        }


    }

    static boolean an(int n){ // void for checking
        int rem;
        int sum=0;
        int r = n;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;

        }
//        if(sum==r)
//        {
//            System.out.println(r+" is a Armstrong Number");
//        }
//        else {
//            System.out.println(r+ " is not a Armstrong number");
//        }
        return sum==r;
    }
}
