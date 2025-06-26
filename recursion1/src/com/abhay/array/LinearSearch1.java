package com.abhay.array;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,18,9,9};
        int target = 2;
        linear(arr,target,0);
        System.out.println(lt);
    }
    static ArrayList<Integer> lt = new ArrayList<>();
    static void linear(int[] arr, int target, int index)
    {

        if(arr[index] == target)
        {
            lt.add(index);
        }
        if(index == arr.length-1)
        {
            return;
        }
        linear(arr,target,index+1);


    }
}
