package com.abhay;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,5,6,7,8,9);
        multiple(34,56,"abhay","rawat");

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
