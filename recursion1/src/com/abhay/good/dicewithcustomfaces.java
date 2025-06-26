package com.abhay.good;

import java.util.ArrayList;

public class dicewithcustomfaces {
    public static void main(String[] args) {

        System.out.println(dice2("",10,6));
    }

    static void dice1(String p, int target,int faces)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= faces && i <= target; i++) {
            dice1(p + i,target-i,faces);


        }
    }
    static ArrayList<String> dice2(String p, int target,int faces)
    {
        if(target == 0)
        {
            ArrayList<String> lt = new ArrayList<>();
            lt.add(p);
            return lt;
        }

        ArrayList<String> lt = new ArrayList<>();

        for (int i = 1; i <= faces && i <= target; i++) {
            lt.addAll(dice2(p + i,target-i,faces));


        }
        return lt;
    }
}
