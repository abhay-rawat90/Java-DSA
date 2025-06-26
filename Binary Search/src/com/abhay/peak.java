package com.abhay;

public class peak {
    public static void main(String[] args) {
        int[] nums = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peak(nums));


    }
    static int peak(int[] arr)
    {
        int start=0;
        int end = arr.length-1;
//        int max= arr[0];
//        int target = 0;
//        for (int i = start; i <end ; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//
//            }
//            target=max;
//
//        }
//        return position(arr,target);
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                end =mid;

            }
            else{
                start = mid+1;
            }
        }
        return start;

    }
//    static int position(int[] nums, int target) {
//        int start=0;
//        int end = nums.length-1;
//        for (int i = start; i <end ; i++)
//        {
//            if(target==nums[i])
//            {
//                return i;
//
//            }
//
//        }
//        return -1;
//    }
}
