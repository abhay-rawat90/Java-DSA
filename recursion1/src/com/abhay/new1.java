package com.abhay;

import java.util.ArrayList;
import java.util.Arrays;

public class new1 {
    public static void main(String[] args) {

        int n =4;
        int[][] arr = {
                {12 ,4 ,6, 3, 14},
                {3, 7, 2, 4},
                {5 ,10 ,14 ,6 ,12 ,7},
                {11 ,5 ,7 ,13 ,2 ,8 ,5}
        };
        for (int i = 0; i < arr.length; i++) {
            ans(arr[i]);
            System.out.println();
        }


    }

    static int max(int[] arr)
    {
        int m =0;
        for(int i =0;i < arr.length;i++)
        {
            m = m + arr[i];

        }
        return m;
    }

    static void ans(int[] arr)
    {
        ArrayList<Integer> lt = new ArrayList<>();
        int n =max(arr);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(n + " ");
            n = n - arr[i];

        }
    }
}
