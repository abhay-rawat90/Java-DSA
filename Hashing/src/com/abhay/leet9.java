package com.abhay;

import java.util.Arrays;

public class leet9 {
    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        System.out.println(Arrays.toString(finalPrices(prices)));

    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[j] <= prices[i])
                {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;

    }
}
