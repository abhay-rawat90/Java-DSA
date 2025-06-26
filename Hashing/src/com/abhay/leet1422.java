package com.abhay;

public class leet1422 {
    public static void main(String[] args) {
        String s ="011101";
        System.out.println(maxScore(s));
        
    }

    public static int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        String left = "";
        String right = "";
        int zeroes = 0;
        int ones = 0;
        int score = 0;
        for (int i = 0; i < s.length() -1; i++) {
            left = left + s.charAt(i);
            if(s.charAt(i) == '0')
            {
                zeroes++;
            }

            for (int j = i + 1; j < s.length(); j++) {
                right = right + s.charAt(j);
                if(s.charAt(j) == '1')
                {
                    ones++;
                }


            }
            score = ones + zeroes;
            if(score > max)
            {
                max = score;
            }
            ones = 0;
            right = "";
        }

        return max;

    }
}
