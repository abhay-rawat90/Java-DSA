package com.abhay;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Freqmap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = inp.nextInt();

        }
        freq(arr);

    }

    public static void freq(int[] arr)
    {
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],count);

            }
            else
            {
                int dum = 0;
                dum = count++;
                mp.put(arr[i],dum);
            }

        }
        int max = 0;

        for (Integer key : mp.keySet())
        {

            if (mp.get(key) > max)
            {
                max = mp.get(key);
            }

        }

        System.out.println(max);
    }
}
