package com.abhay;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int p = inp.nextInt();
            arr[i] = p;
        }
        int num = inp.nextInt();
        for (int i = 0; i < num; i++) {
            int m = inp.nextInt();
            System.out.println(frequency(arr,m));
        }


    }

    public static int frequency(int[] arr,int p)
    {
        int num1 = 13;
        int[] hash = new int[num1];
        for (int i = 0; i < 13; i++) {
            hash[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == p)
            {
                hash[p]++;
            }
        }
        return hash[p];

    }

}
