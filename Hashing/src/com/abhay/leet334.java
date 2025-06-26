package com.abhay;

public class leet334 {
    public static void main(String[] args) {
        int[] nums = {6,7,1,2};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[left] < nums[right]) {
                count++;
                if (count == 2) {
                    return true;
                }
                left = right;
            } else {
                count = 0;
                left = right;
            }
            right++;
        }

        return false;


    }
}
