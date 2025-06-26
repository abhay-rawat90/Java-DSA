package com.abhay;

public class leet643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));

    }

    public static double findMaxAverage(int[] nums, int k) {
        double total = 0;
        double avg = 0;
        double max = Integer.MIN_VALUE;
        for(int i = 0;i <=nums.length - k;i++ )
        {
            for(int j = i; j < i + k;j++)
            {
                total = total + nums[j];

            }

            avg = total/k;
            if(avg > max)
            {
                max = avg;
            }
            total = 0;
        }

        return max;

    }
}
