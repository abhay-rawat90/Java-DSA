package com.abhay.generics.lambdafunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LF {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);

        }

//        arr.forEach((item) -> System.out.println(item * 2));
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LF  myCalculator = new LF();
        System.out.println(myCalculator.operate(5,3,sum));
    }


    private int operate(int a,int b, Operation op)
    {
        return op.operation(a,b);
    }
    interface Operation {
        int operation(int a,int b);
    }
}
