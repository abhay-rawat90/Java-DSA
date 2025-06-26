package com.abhay.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 9;
        System.out.println(linear(arr,target,0));
    }

    static int linear(int[] arr,int target,int index)
    {
        if(arr[index] == target)
        {
            return index;
        }
        if(index == arr.length-1)
        {
            return -1;
        }
        return linear(arr,target,index+1);


    }
}
