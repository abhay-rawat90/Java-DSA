package com.abhay;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);

        //swap number code
//        int temp = a;
//        a=b;
//        b=temp;
        System.out.println(a+" "+b);

    }

    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
