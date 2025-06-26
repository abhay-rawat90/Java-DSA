package com.abhay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class leet1 {
    public static void main(String[] args) {

        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));


    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
            int i =0;
            int left =1;
            int right = nums.length-1;

            while(left < right) {
                sum = nums[i] + nums[left] + nums[right];
                q1.add(sum);
                if (sum > target) {
                    right--;
                }
                if (sum < target) {
                    left++;
                }
            }
        int a = 0;

        while(!q1.isEmpty())
        {
            int q = q1.remove();
            if(q > target)
            {
                return q;
            }

            if(q < target)
            {
                a = q;
            }


        }


        return sum;


    }
}
