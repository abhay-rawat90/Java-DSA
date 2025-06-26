package com.abhay;

public class Primeno {
    public static void main(String[] args) {
        int n = 16;
        for (int i = 1; i <=n ; i++) {
            System.out.println(prime(i));

        }

    }
    static String prime(int n)
    {
        if(n==1)
        {
            return ("1 is neither prime nor composite");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
            {
                return (n + " is not a prime no.");

            }

        }
        return (n + " is a prime no.");
    }
}
