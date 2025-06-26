package com.abhay;

public class min {
    public static void main(String[] args) {
        int[] nums ={1,7,4,-90,23,10};
        System.out.println("Minimum number in the array is " + min(nums));

    }

    static int min(int[] arr)
    {
        int minim = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minim)
            {
                minim = arr[i];
            }



        }
        return minim;
    }
}
