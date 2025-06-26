package com.abhay;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(2,3,4,5,6,8,9,0,10);
        multiple(2,3,"abhay","rawat");
    }

    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
