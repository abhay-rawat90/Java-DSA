package com.abhay;

public class duplicaterotated {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        System.out.println(search(arr,9));




    }
    //this will not work for duplicate elements
    static int findpivotwithduplicate(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            //4 cases over here
            if(mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end])
            //skip the duplicates
                //Notes: What if these elements at start and end were the pivot ?
                //check if start is pivot
            {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            }


        }

        return -1;
    }

    static int search(int[] nums, int target){
        int pivot = findpivotwithduplicate(nums);
        if (pivot == -1)
        {
            return binarysearch(nums,target,0,nums.length-1);

        }
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if(target> nums[0])
        {
            return binarysearch(nums,target,0,pivot-1);
        }

        return binarysearch(nums,target,pivot+1,nums.length-1);

    }
    static int binarysearch(int[] nums, int target,int start,int end)
    {
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
