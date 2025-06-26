package com.abhay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class alldup {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(dup(arr));
    }
    static List<Integer> dup(int[] nums)
    {
        ArrayList<Integer> list = new ArrayList<>();
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
                list.add(nums[j]);

            }

        }
        return list;
    }
}
