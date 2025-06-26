package com.abhay;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void cycle(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            while(i != arr[i]-1 )
            {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }

        }
    }
}
