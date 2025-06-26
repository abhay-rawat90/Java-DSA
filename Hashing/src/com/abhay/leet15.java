package com.abhay;

public class leet15 {
    public static void main(String[] args) {
        int[] flowerbed = {0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed,n));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0)
            {
                count0++;
            }
            else {
                count1++;
            }
        }

        if((count0 - count1) % 2 == 0)
        {
            return false;
        }


        if(flowerbed[0] == 0 && flowerbed[1] == 1)
        {
            for (int i = 1; i < flowerbed.length; i =i + 2) {
                if(flowerbed[i] == 0)
                {
                    n--;
                    if(n == 0)
                    {
                        return true;
                    }
                }

            }
        }

        for (int i = 0; i < flowerbed.length; i =i + 2) {
            if(flowerbed[i] == 0)
            {
                n--;
                if(n == 0)
                {
                    return true;
                }
            }

        }
        return false;

    }
}
