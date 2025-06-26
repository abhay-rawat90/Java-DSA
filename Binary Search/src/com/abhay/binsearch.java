package com.abhay;

public class binsearch {
    public static void main(String[] args) {
        int[] arr = {-16,-14,-2,0,2,3,4,15,16,18,22};
        int target  = 0;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }

    //return index
    //return -1 if it does not exist
    static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            //find the middle element
            int mid = start + (end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;

            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
