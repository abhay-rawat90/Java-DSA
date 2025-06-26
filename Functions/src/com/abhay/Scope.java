package com.abhay;

public class Scope {
    public static void main(String[] args) {
       int a=10;
       int b=20;
        {
            //int a =30; already initialised outside the block ,can't inititate again
            a=78;//reassign the original ref. variable to some other value
            int c=99;
            //values initialise in this block will remain in this block , this is block scope
        }
    //    System.out.println(c);//cannot use outside th block
        System.out.println(a);
    }

}
