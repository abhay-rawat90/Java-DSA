package com.abhay;

public class leet3 {
    public static void main(String[] args) {
        int[] nums = {10,44,10,8,48,30,17,38,41,27,16,33,45,45,34,30,22,3,42,42};
        System.out.println(findScore(nums));

    }
    public static long findScore(int[] nums){
        boolean[] arr = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = true;
        }
        long sum = 0;



        for (int k = 0; k < nums.length; k++) {
            int min = Integer.MAX_VALUE;
            int a = -1;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] < min && arr[i] == true)
                {
                    min = nums[i];
                    a = i;
                }

            }
            if (a == -1)
            {
                break;
            }

            sum = sum + min;
            arr[a] = false;
            if(a > 0)
            {
                arr[a-1] = false;
            }
            if (a < nums.length - 1)
            {
                arr[a+1] = false;
            }

        }



        return sum;

    }







}
