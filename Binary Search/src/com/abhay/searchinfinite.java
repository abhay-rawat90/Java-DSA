package com.abhay;

public class searchinfinite {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,8,9,10,11,12,15,16,17,18,20};
        int target =17;
        System.out.println(ans(nums,target));


    }
    static int ans(int[] arr, int target)
    {
        int start =0;
        int end =1;

        //condition for the target to lie in range
        while(target>arr[end])
        {
            int newstart=end+1;
            // end = previous end + sizeofbox*2
            end=end + (end-start+1)*2;
            start= newstart;
        }
        return position(arr,target,start,end);
    }
    static int position(int[] nums, int target,int start, int end) {
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
            {
                end = mid - 1;
            }
            else if (target > nums[mid])
            {
                start = mid + 1;

            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
