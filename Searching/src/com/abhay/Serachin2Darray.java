package com.abhay;

public class Serachin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {34,5,7,8,},
                {23,56,76,89}

        };
        int target = 6;
        System.out.println(search(arr,target));

    }

    static boolean search(int[][] arr, int target) {
        if (arr.length==0) {
            return false;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (target==arr[row][col])
                {
                    return true;
                }

            }

        }
        return false;
    }
}
