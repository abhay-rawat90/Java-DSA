package com.abhay.array;

import java.util.ArrayList;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,18,9,9};
        int target = 2;
        System.out.println(linear1(arr,target,0));
    }
    static ArrayList linear(int[] arr, int target, int index,ArrayList <Integer> lt)
    {

        if(arr[index] == target)
        {
            lt.add(index);
        }
        if(index == arr.length-1)
        {
            return lt;
        }
        return linear(arr,target,index+1,lt);


    }

    static ArrayList<Integer> linear1(int[] arr, int target, int index)
    {
        ArrayList<Integer> lt = new ArrayList<>();

        if(arr[index] == target)
        {
            lt.add(index);
        }

        if(index == arr.length-1)
        {
            return lt;
        }
        ArrayList<Integer> ansfrombelow = linear1(arr,target,index+1);
        lt.addAll(ansfrombelow);
        return lt;


    }
}
