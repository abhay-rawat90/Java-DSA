package com.abhay.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    public double getL() {
        return l;
    }

    static void Greeting(){
        System.out.println("I am in box");
    }

    Box()
    {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box (double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l,double h,double w)
    {
        this.l =l;
        this.h = h;
        this.w = w;
    }

    Box(Box old)
    {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void info(){
        System.out.println("Running the box");
    }
}
