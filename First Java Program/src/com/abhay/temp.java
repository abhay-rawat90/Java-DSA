package com.abhay;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celsius:");
        Scanner input = new Scanner(System.in);
        float cs = input.nextFloat();
        float fh = (cs*9/5)+32;
        System.out.println("Temperature in Fahrenheit is :" + fh);
    }
}
