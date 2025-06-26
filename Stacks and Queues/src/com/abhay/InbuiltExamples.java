package com.abhay;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(4);
//        System.out.println(stack.get(1));
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(4);
//        queue.add(1);
//        queue.add(2);
//
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(12);
        deque.remove();

    }
}
