package com.abhay;

public class leet283 {
    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums) {
        int  count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
            {
                count++;

            }
        }

        while(count > 0)
        {

            for(int j =0; j < nums.length -1 ;j++)
            {
                if(nums[j] == 0 && nums.length > 1)
                {
                    int temp = nums[j];
                    nums[j]  = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
            count--;


        }

    }
}
