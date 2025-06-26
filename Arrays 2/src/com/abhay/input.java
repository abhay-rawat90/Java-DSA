package com.abhay;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= inp.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        arr[3]=56;//modify
        System.out.println(Arrays.toString(arr));
    }
}
