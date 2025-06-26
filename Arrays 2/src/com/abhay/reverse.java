package com.abhay;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr, start, end);
            start ++;
            end--;
        }




    }
    static void swap(int[] arr,int ind1,int ind2)
    {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
