package com.abhay;

public class leet443 {
    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','b','a','a'};
        System.out.println(compress(chars));

    }

    public static int compress(char[] chars) {
        int count = 0;
        String s = "";
        for (int i = 0; i < chars.length; i = i + count) {
            count = 0;
            for (int j = i; j < chars.length; j++) {
                if(chars[i] == chars[j])
                {
                    count++;
                }
                else{
                    break;
                }
            }
            s = s + chars[i];
            if(count >= 2)
            {
                s = s + count;
            }

        }

        char[] compressed = s.toCharArray();
        for (int i = 0; i < compressed.length; i++)
        {
            chars[i] = compressed[i];
        }


        return compressed.length;

    }
}
