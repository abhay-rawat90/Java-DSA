package com.abhay;

import java.util.HashMap;

public class leet1692 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums,k));

    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (freq.getOrDefault(complement, 0) > 0) {
                count++;
                freq.put(complement, freq.get(complement) - 1); // Use one occurrence of the complement
            } else {
                freq.put(num, freq.getOrDefault(num, 0) + 1); // Store the current number
            }
        }

        return count;

    }
}
