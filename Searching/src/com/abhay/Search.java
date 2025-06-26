package com.abhay;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
//        int[] nums = new int[8];
        Scanner inp = new Scanner(System.in);
//        for (int i = 0; i <nums.length ; i++) {
//            System.out.print("Enter a number for array: ");
//            nums[i] = inp.nextInt();
//
//        }
        int[] nums = {1,45,7,6,87,98,75,45,54};
//        System.out.print("Enter the number you are searching in the array: ");
//        int target = inp.nextInt();
        int target = 1;
        boolean ans = linearSearch(nums,target,0,8);
        System.out.println(ans);

    }
    //search in the array: return the index if item found
    //otherewise if item not found return -1

    static boolean linearSearch(int[] arr,int target,int start,int end)
    {
        if (arr.length==0){
            return false;
        }
        for (int index = start; index <=end; index++) {
            int element = arr[index];
            if(element==target)
            {
                return true;
            }



        }
        return false;

    }
}
