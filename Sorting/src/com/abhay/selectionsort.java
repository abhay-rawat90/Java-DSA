package com.abhay;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[]  arr = {4,5,1,2,3,};
        selsort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selsort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);

        }

    }
    static int getmaxindex(int[] arr, int start,int end)
    {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }

        }
        return max;

    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
