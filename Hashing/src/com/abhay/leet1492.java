package com.abhay;

import java.util.ArrayList;

public class leet1492 {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        System.out.println(kthFactor(n,k));

    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> arr  = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
            {
                arr.add(i);
            }
            
        }
        int[] ans = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);

        }

        if(k <= ans.length)
        {
            return ans[k-1];

        }

        return -1;


    }
}
