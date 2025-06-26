package com.abhay;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        System.out.println(list);
        //input
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }



    }
}
