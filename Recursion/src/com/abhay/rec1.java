package com.abhay;

public class rec1 {
    public static void main(String[] args) {
        // write a function that takes a no. and print it
        //print number 1 to 5
        print(1);


    }
    static void print( int n){
        if(n==5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you are calling a function again and again,
        //you can treat it as a seperate call in the stack
        print(n+1);
        //this is called tail recursion
        //this the last function call

    }


}
