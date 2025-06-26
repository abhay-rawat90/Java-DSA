package com.abhay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leet6 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        int multiplier = 4;
        int[] arr = getFinalState(nums,k,multiplier);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        if(k == 0)
        {
            return nums;
        }

        int min = Integer.MAX_VALUE;
        int a =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min)
            {
                min = nums[i];
                a = i;
            }

        }

        nums[a] = min * multiplier;
        return getFinalState(nums,k = k-1,multiplier);


    }
}
