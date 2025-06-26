package com.abhay;

public class evnno {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(even(nums));

    }
    static int even(int[] nums)
    {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if(check(nums[i]) == true)
            {
                c++;
            }
            if(nums[i]<0)
            {
                nums[i] = nums[i] * -1;

            }

        }
        return c;
    }
    static boolean check(int num){
        int count = 0;
        while(num>0)
        {
            count++;
            num=num/10;

        }
        if(num==0)
        {
            count=1;
        }
        if(count%2==0)
        {
            return true;
        }
        return false;

    }
}
