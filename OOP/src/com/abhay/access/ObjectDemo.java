package com.abhay.access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(45);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        if(obj == obj2)
        {
            System.out.println("Equal");
        }

        if(obj.equals(obj2))
        {
            System.out.println("Equal");
        }

        System.out.println(obj.getClass().getName());
    }
}
