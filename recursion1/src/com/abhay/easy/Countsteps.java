package com.abhay.easy;

public class Countsteps {
    public static void main(String[] args) {
        int num = 41;
        System.out.println(numberOfSteps(num));
    }
    static int count =0;

    static int numberOfSteps(int num)
    {
        if(num == 0)
        {
            return count;
        }
        if(num % 2 == 0)
        {
            int num1 = num/2;
            count ++;
            numberOfSteps(num1);
        }
        else {
            int num2 = num -1;
            count++;
            numberOfSteps(num2);
        }
        return count;

    }

}
