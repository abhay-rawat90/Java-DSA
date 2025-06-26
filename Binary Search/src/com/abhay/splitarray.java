package com.abhay;

public class splitarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int m = 2;
        System.out.println(split(arr,m));

    }
    static int split(int[] nums, int m)
    {
        int start =0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            end+= nums[i];

        }

        while(start< end) {
            int mid = start + (end - start) / 2;
            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > m)
            {
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}
