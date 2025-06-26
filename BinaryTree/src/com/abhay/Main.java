package com.abhay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BT tree = new BT();
//        tree.populate(scanner);
//        tree.prettydisplay();

//        BST tree = new BST();
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        tree.populatesorted(nums);
//        tree.Display();

//        AVL tree = new AVL();
//
//        for (int i = 0; i < 1000; i++) {
//            tree.insert(i);
//
//        }
//        System.out.println(tree.height());

        int[] arr = {3,8,6,7,-1,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();
        System.out.println(tree.query(2,6));


    }
}
