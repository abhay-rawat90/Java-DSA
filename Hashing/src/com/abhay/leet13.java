package com.abhay;

public class leet13 {
    public static void main(String[] args) {
        int[] heights = {1,5,1,2,3,4,10000};
        int bricks = 4;
        int ladders = 1;
        System.out.println(furthestBuilding(heights,bricks,ladders));

    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int count = 0;
        int used;
        for (int i = 0; i < heights.length; i++) {
            if(i == heights.length -1)
            {
                return count;
            }

            if(heights[i] < heights[i + 1])
            {
                if(ladders == 0 && bricks == 0)
                {
                    break;
                }
                used = heights[i+1] - heights[i];
                if(used <= bricks )
                {
                    bricks = bricks - used;

                }

                else
                {
                    ladders--;
                }

            }

            count++;
        }
        return count  ;

    }
}
