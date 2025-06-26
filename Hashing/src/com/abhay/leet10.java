package com.abhay;

import java.util.Arrays;

public class leet10 {
    public static void main(String[] args) {
        int[] digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        long sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = (long)(sum + (digits[i] * Math.pow(10,(double)(digits.length- 1 - i))));

        }

        long sum1 = sum + 1;
        long ans1 = sum1;
        int count = 0;
        while(sum1 > 0)
        {
            sum1 = sum1/10;
            count++;
        }

        int[] ans = new int[count];
        for (int i = 0; i < ans.length; i++) {
            long rem = ans1 % 10;
            ans[ans.length - 1- i] = (int) rem;
            ans1 = ans1/10;

        }


        return ans;


    }
}
