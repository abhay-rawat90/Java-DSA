package com.abhay;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        String s = "abcdecd";
//        Scanner inp = new Scanner(System.in);
//        int n = inp.nextInt();
        char ch = 'd';
        System.out.println(charfreq(s,ch));
    }

    public static int charfreq(String s, char ch)
    {
        int[] hash = new int[26];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = 0;
        }
        int f = 'a';
        int g = ch;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch)
            {
                hash[g-f]++;
            }
        }
        return hash[g-f];
    }
}
