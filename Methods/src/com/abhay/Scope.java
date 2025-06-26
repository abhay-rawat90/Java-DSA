package com.abhay;

public class Scope {
    public static void main(String[] args) {
        int a= 50;
        int b=90;
        {
           // int a=35;// cannot be initialized again but value can be changed and used
            int c =100;
            //Values initialized in this block are only valid in this block and remain in it
        }
        //c=50;// cannot be use outside the block
        //System.out.println(c);

        //scoping in for loop
        for (int i = 0; i < 10; i++) {

        }
       // System.out.println(i);
    }
}
