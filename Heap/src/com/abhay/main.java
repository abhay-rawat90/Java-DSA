package com.abhay;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> hp = new Heap<>();

        hp.insert(34);
        hp.insert(44);
        hp.insert(22);
        hp.insert(12);
        hp.insert(56);

//        System.out.println(hp.remove());
        ArrayList list = hp.heapsort();
        System.out.println(list);
    }
}
