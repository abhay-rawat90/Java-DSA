package com.abhay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disappeared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disappear(arr));
    }
    static List<Integer> disappear(int[] nums)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        while(i< nums.length)
        {
            if(nums[i] != nums[nums[i]-1])
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
                list.add(j+1);
            }

        }
        return list;
    }
}
