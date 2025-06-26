package com.abhay.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        mergeinplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return sort(left, right);
    }

    static int[] sort(int[] f, int[] se) {
        int[] mix = new int[f.length + se.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < f.length && j < se.length) {
            if (f[i] < se[j]) {
                mix[k] = f[i];
                i++;
            } else {
                mix[k] = se[j];
                j++;
            }
            k++;
        }

        while(i < f.length)
        {
            mix[k] = f[i];
            i++;
            k++;
        }

        while(j < se.length)
        {
            mix[k] = se[j];
            j++;
            k++;
        }
        return mix;

    }

    static void mergeinplace(int[] arr,int s,int e) {
        if (e-s == 1) {
            return ;
        }
        int mid = s+(e-s) / 2 ;

        mergeinplace(arr,s,mid);
        mergeinplace(arr,mid,e);

       sort2(arr,s,mid,e);
    }

    static void sort2(int[] arr,int s,int m, int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l= 0; l < mix.length; l++) {
            arr[s+l] =mix[l];

            
        }

    }

}
