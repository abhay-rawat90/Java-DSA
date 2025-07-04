package com.abhay.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFault_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int [DEFault_SIZE];
    }

    public void add(int num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove()
    {
        int removed = data[--size];
        return removed;
    }
    public int get(int index)
    {
        return data[index];
    }

    public int size()
    {
        return size;
    }
    public void set(int index,int value)
    {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList lt = new CustomArrayList();
        lt.add(3);
        lt.add(5);
        lt.add(10);
        System.out.println(lt);

    }
}
