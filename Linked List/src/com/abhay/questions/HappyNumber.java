package com.abhay.questions;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        // while(n != 0)
        // {
        //     int rem = n % 10;
        //     n = n/10;
        //     int a = rem * rem + n * n;
        //     if(a == 1)
        //     {
        //         return true;
        //     }

        //     n = a;
        // }
        // return false;
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1)
        {
            return true;
        }

        return false;




    }


    private static int findSquare(int number)
    {
        int ans = 0;
        while(number > 0)
        {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;

    }
}
