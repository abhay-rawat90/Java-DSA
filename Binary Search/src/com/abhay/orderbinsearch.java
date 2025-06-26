package com.abhay;

public class orderbinsearch {
    public static void main(String[] args) {
        int[] arr ={93,78,65,45,30,5,4,2,1,};
        int target = 30;
        if(order(arr)==true)
        {
            System.out.println(incorder(arr,target));
        }
        else {
            System.out.println(decorder(arr,target));
        }

    }
    static boolean order(int[] arr)
    {
        if(arr[0]<arr[arr.length-1])
        {
            return true;
        }
        else {
            return false;
        }
    }

    static int incorder(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            } else if (target<arr[mid]) {
                end =mid-1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int decorder(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(target>arr[mid])
            {
                end = mid-1;
            } else if (target<arr[mid]) {
                start = mid+1;

            }
            else {
                return mid;
            }
        }
        return -1;
    }


}
