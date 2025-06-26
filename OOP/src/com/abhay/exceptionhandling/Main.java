package com.abhay.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a= 5;
        int b = 0;
        try
        {
//            divide(a,b);
            throw new Exception("Just for fun");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("normal Exception");
        }
        finally {
            System.out.println("This");
        }
    }
    static int divide(int a,int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
