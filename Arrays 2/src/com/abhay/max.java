package com.abhay;

public class max {
    public static void main(String[] args) {
        int[] arr = {1,6,100,98,78};
        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(max<arr[i])
            {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
