package com.abhay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(dup(arr));
    }
    static int dup(int[] nums)
    {
        int i=0;
        while(i< nums.length)
        {
            if(nums[i] == nums[nums[i]-1])
            {
                i++;
                continue;
            }
            if(nums[i]-1!= i)
            {


                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1]= temp;

            }

            else
            {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
            {
                return nums[j];
            }

        }
        return -1;
    }
}
