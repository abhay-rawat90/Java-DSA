package com.abhay;

public class leetQ11 {
    public static void main(String[] args) {
        int[] height = {1,2};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length ; i++) {
            for (int j = height.length -1; j >= 0; j--) {
                if( height[i] >= height[j])
                {
                    int area = (height[j] * (j-i));
                    if(area >= max)
                    {
                        max = area;
                    }
                }
            }


        }

        return max;

    }
}
