package com.abhay;

import java.util.ArrayList;

public class leet151 {
    public static void main(String[] args) {
        String s = " hello world ";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        int i = 0;
        while(i < s.length())
        {
            String str = "";
            while(s.charAt(i) != ' ') {
                str = str + s.charAt(i);
                if (i == s.length() - 1) {
                    break;
                }
                i++;

            }
            if(str != "")
            {
                arr.add(str);
            }

            i++;

        }

        String str = "";

        for(int j = arr.size()-1; j >= 0;j--)
        {
            if(j == 0)
            {
                str = str + arr.get(j);
            }
            else {
                str = str + arr.get(j) + " ";
            }

        }

        return str;






    }
}
