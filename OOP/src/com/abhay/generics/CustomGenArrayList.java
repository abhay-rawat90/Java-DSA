package com.abhay.generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFault_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){

        this.data = new Object[DEFault_SIZE];
    }

    public void add(T num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove()
    {
        T removed = (T)data[--size];
        return removed;
    }
    public T get(int index)
    {
        return (T)data[index];
    }

    public int size()
    {
        return size;
    }
    public void set(int index,T value)
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
        CustomGenArrayList<Integer> lt = new CustomGenArrayList<>();
        lt.add(3);
        lt.add(5);
        lt.add(10);
        System.out.println(lt);

    }
}
