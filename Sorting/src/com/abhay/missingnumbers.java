package com.abhay;

import java.util.Arrays;

public class missingnumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(cycle(arr));

    }

    static int cycle(int[] nums)
    {
        int i=0;
        while(i< nums.length)
        {
            if(nums[i] < nums.length && nums[i]!= i)
            {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp]= temp;

            }

            else
            {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j)
            {
                return j;
            }

        }
        return nums.length;
    }
}
