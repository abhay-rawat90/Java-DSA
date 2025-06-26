package com.abhay;

public class Sqroot {
    public static void main(String[] args) {
        int n =40;
        int p =3;
        System.out.printf("%.3f",sr(n,p));

    }
    static double sr(int x,int p)
    {
        int s = 0;
        int e = x;
        double root = 0.0;
        while(s <= e)
        {
            int mid = s+(e-s)/2;

            if(mid*mid == x)
            {
                return mid;
            }
            if(mid*mid > x)
            {
                e = mid-1;
            }
            else {
                s=mid+1;
            }
        }
        double incr =0.1;
        for (int i = 0; i < p; i++) {
            while(root*root <= x)
            {
                root+=incr;
            }
            root-= incr;
            incr/= 10;

        }
        return root;

    }
}
