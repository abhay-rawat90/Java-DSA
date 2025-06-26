package com.abhay;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multidimarray {
    public static void main(String[] args) {
        //input
        int[][] arr = new int[3][3];
        Scanner inp = new Scanner(System.in);
        System.out.println(arr.length); //it will give no. of rows

        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= inp.nextInt();
                
            }
            
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }

        //output using modified for loop
        for (int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }

        

    }
}
