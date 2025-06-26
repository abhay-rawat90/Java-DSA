package com.abhay;

import java.util.ArrayList;
import java.util.Arrays;

public class leet12 {
    public static void main(String[] args) {
        int[] heights = {1,2};
        int[][] queries = {{0,0},{0,1},{1,0},{1,1}};
        System.out.println(Arrays.toString(leftmostBuildingQueries(heights,queries)));

    }

    public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < queries.length; i++)
        {
            for (int j = Math.max(queries[i][0],queries[i][1]); j < heights.length ; j++) {
                if(queries[i][0] == queries[i][1])
                {
                    arr.add(queries[i][1]);
                    break;
                }
                if(heights[queries[i][1]] > heights[queries[i][0]] && queries[i][1] > queries[i][0])
                {
                    arr.add(queries[i][1]);
                    break;

                }

                if(heights[j] >= heights[queries[i][0]] )
                {
                    if(heights[j] >= heights[queries[i][1]])
                    {
                        arr.add(j);
                        break;

                    }
                }
                if( j == heights.length -1)
                {
                    arr.add(-1);
                }


            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);

        }



        return ans;

    }
}


