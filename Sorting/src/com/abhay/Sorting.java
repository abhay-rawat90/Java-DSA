package com.abhay;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        System.out.println(Arrays.toString(sort(arr)));
        

    }
    static int[] sort(int[] arr)
    { int temp = 0;
        boolean swapped;
        for (int i = 0; i < arr.length-2; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;

                }

            }
            if (swapped == false)
            {
                break;
            }
            
        }
        return arr;
    }
}
