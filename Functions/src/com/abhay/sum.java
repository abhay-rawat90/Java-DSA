package com.abhay;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = inp.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = inp.nextInt();
        int a = sum2(num1,num2);
        System.out.println("Sum is "+a);
    }

    static void sum(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = inp.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = inp.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is "+ sum);

    }
    static int sum2(int a,int b){
        int sum = a+b;
        return sum;

    }
}
