package com.abhay.questions;

import java.util.Stack;

public class GameofTwostacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(6);
        stack1.push(4);
        stack1.push(2);
        stack1.push(4);
        stack2.push(5);
        stack2.push(8);
        stack2.push(1);
        stack2.push(2);
        int max = 15;

        int sum = 0;
        int count = 0;
        while(sum <= max)
        {
            sum = sum + stack1.pop();
            count ++;
            if(sum > max)
            {
                count = count - 1;
            }
            sum = sum + stack2.pop();
            count++;
            if(sum > max)
            {
                count = count - 1;
            }
        }

        System.out.println(count);
    }
}
