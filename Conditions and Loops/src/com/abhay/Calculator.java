package com.abhay;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Take input from user unyill user does not press X or x
        int ans = 0;

        while(true)
        {
            //take the operator as input
            System.out.print("Enter the operator:");
            char op = inp.next().trim().charAt(0);
            if(op =='+' || op == '-' || op=='*' || op=='/' || op == '%')
            {
                //input two numbers
                System.out.print("Enter number 1:");
                int num1 = inp.nextInt();
                System.out.print("Enter number 2:");
                int num2 = inp.nextInt();

                if(op== '+')
                {
                    ans = num1+num2;

                }
                if(op== '-')
                {
                    ans = num1-num2;

                }
                if(op== '*')
                {
                    ans = num1*num2;

                }
                if(op== '/')
                {
                    if(num2!=0)
                    {
                        ans =num1/num2;
                    }
                    else
                    {
                        System.out.println("Enter number 2 Other than zero");
                    }

                }
                if(op== '%')
                {
                    ans = num1%num2;

                }
            }
            else if(op=='X' || op == 'x')
            {
                break;
            }
            else {
                System.out.println("Invalid operations!!");
            }
            System.out.println(ans);

        }


    }
}
