package com.abhay.questions;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }



    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);
        for(int i = 1; i< heights.length; i++)
        {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(heights,stack,max,i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while(!stack.isEmpty()){
            max = getMax(heights,stack,max,i);
        }



        return max;

    }

    private static int getMax(int[] arr,Stack<Integer> stack,int max,int i)
    {
        int area;
        int popped = stack.pop();
        if(stack.isEmpty())
        {
            area = arr[popped] * i;
        }
        else
        {
            area = arr[popped] * (i - 1 - stack.peek());
        }

        return Math.max(max,area);
    }
}
