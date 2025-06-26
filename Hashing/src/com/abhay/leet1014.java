package com.abhay;

public class leet1014 {
    public static void main(String[] args) {
        int[] values = {1,3,5};
        System.out.println(maxScoreSightseeingPair(values));
    }

    public static int maxScoreSightseeingPair(int[] values) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = 1;
        while(l < values.length || r < values.length)
        {
            if(r > l && r < values.length)
            {
                int sum = values[l] + values[r] + l - r;
                if(sum > max)
                {
                    max = sum;
                }
                r++;
            }

            else
            {
                l++;
                r = l + 1;
            }


        }

        return max;

    }
}
