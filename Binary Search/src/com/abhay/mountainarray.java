package com.abhay;

public class mountainarray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(index(arr,target));

    }
    static int peak(int[] arr)
    {
        int start=0;
        int end = arr.length-1;
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

    static int index(int[] MountainArray, int target)
    {
        int max =peak(MountainArray);
        if (target<MountainArray[max])
        {
            int start =0;
            int end = max;
            while (start <= end)
            {
                int mid = start + (end - start) / 2;
                if (target < MountainArray [mid])
                {
                    end = mid - 1;
                }
                else if (target > MountainArray[mid])
                {
                    start = mid + 1;

                }
                else
                {
                    return mid;
                }
            }
        }
        else {
            int start =max+1;
            int end=MountainArray.length-1;
            while (start <= end)
            {
                int mid = start + (end - start) / 2;
                if (target < MountainArray[mid])
                {
                    start= mid+1;
                }
                else if (target > MountainArray[mid])
                {
                    end = mid-1;

                }
                else
                {
                    return mid;
                }
            }
        }
        return  -1;
    }
}
