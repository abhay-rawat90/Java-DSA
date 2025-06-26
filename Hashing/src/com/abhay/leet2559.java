package com.abhay;

import java.util.Arrays;

public class leet2559 {
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(vowelStrings(words,queries)));

    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int count = 0;
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                if(words[j].charAt(0) == 'a' || words[j].charAt(0) == 'e' || words[j].charAt(0) == 'i' || words[j].charAt(0) == 'o' || words[j].charAt(0) == 'u')
                {
                    if(words[j].charAt(words[j].length() -1) == 'a' || words[j].charAt(words[j].length() -1) == 'e' || words[j].charAt(words[j].length() -1) == 'i' ||words[j].charAt(words[j].length() -1) == 'o' ||words[j].charAt(words[j].length() -1) == 'u')
                    {
                        count++;
                    }
                }
            }
            ans[i] = count;
            count= 0;
        }

        return ans;

    }
}
