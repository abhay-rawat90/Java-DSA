package com.abhay;

public class rotationcount {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(findrotcount(arr));

    }
    static int findrotcount(int[] arr)
    {
        int pivot = findpivot(arr);
        return pivot+1;
    }
    static int findpivot(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return -1;
    }
    //use when duplicate elements are present

    static int finddupliactepivot(int[] arr)
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

}
