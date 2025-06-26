package com.abhay;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(3);
        queue.insert(32);
        queue.insert(2);
        queue.insert(3);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(23);
        queue.display();

    }
}
