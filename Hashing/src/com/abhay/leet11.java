package com.abhay;

import java.util.HashMap;

public class leet11 {
    public static void main(String[] args) {
        int[] nums ={0,0,0,0,3};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        if(nums[0] == 0)
        {
            for(int i = 0;i <= nums[nums.length-1];i++)
            {
                count++;
                if(nums[i] != i)
                {
                    for (int j = i + 1; j < nums.length ; j++) {
                        if(i == nums[j])
                        {
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j]= temp;

                        }

                    }

                }
            }
        }

        if(nums[0] == 1)
        {
            for(int i = 0;i < nums[nums.length-1];i++)
            {
                count++;
                if(nums[i] != i + 1)
                {
                    for (int j = i + 1; j < nums.length ; j++) {
                        if(i + 1 == nums[j])
                        {
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j]= temp;

                        }

                    }
                }
            }

        }


        return count;

    }

}
