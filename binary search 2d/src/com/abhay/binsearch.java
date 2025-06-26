package com.abhay;

import java.util.Arrays;

public class binsearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 49;
        System.out.println(Arrays.toString(binsearch2d(arr,target)));


    }

    static int[] binsearch2d(int[][] arr, int target) {
        int row = 0;
        int col =arr.length-1;
        while(row < arr.length && col >= 0)
        {
            if (arr[row][col] == target)
            {
                return new int[]{row,col};
            }
            if(arr[row][col] < target)
            {
                row++;
            }
            if(arr[row][col] > target)
            {
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
