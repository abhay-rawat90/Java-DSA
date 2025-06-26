package com.abhay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leet1752 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(check(nums));

    }

    public static boolean check(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            arr1.add(nums[i]);
        }
        Arrays.sort(nums);


        for(int i = 0;i < nums.length;i++)
        {
            Collections.rotate(arr1,1);

            for (int j = 0; j < nums.length; j++) {
                if(nums[j] != arr1.get(j))
                {
                    break;
                }
                else{
                    count++;
                }
                if(count == nums.length)
                {
                    return true;
                }
            }
        }
        return false;

    }
}
