package com.abhay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class leet7 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(largestInteger(num));

    }

    public static int largestInteger(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        while(num > 0)
        {
            a = num % 10;
            arr.add(a);
            num = num /10;
        }

//        for (int i = 0; i < arr.size(); i++) {
//            if(arr.get(i) % 2 == 0)
//            {
//
//            }
//        }
        return a;

    }
}
