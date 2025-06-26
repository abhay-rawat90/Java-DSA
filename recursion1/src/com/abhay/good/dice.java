package com.abhay.good;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(dice2("",4));
    }

    static void dice1(String p, int target)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice1(p + i,target-i);


        }
    }
    static ArrayList<String> dice2(String p, int target)
    {
        if(target == 0)
        {
            ArrayList<String> lt = new ArrayList<>();
            lt.add(p);
            return lt;
        }

        ArrayList<String> lt = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            lt.addAll(dice2(p + i,target-i));


        }
        return lt;
    }
}
