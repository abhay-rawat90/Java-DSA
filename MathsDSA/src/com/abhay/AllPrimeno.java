package com.abhay;

public class AllPrimeno {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <=n ; i++) {
            if(prime(i) ==0)
            {
                continue;
            }
            else {
                System.out.print(prime(i) + " ");
            }

        }

    }
    static int prime(int n)
    {
        for (int i = 2; i*i <= n; i++) {
            if(n%i == 0)
            {
               return(0);

            }

        }
        return (n);
    }
}
