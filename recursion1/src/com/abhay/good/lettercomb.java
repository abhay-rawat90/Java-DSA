package com.abhay.good;

import java.util.ArrayList;
import java.util.List;

public class lettercomb {
    public static void main(String[] args) {
        String up = "23";
        System.out.println(letterCombinations("",up));
    }

    static void lettercombination(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        
        int digits = up.charAt(0) - '0';
        for (int i = (digits-2)*3; i < (digits-1)*3; i++) {
            char ch = (char)('a' + i );
            lettercombination(p+ch,up.substring(1));

            
        }


    }

    static List<String> letterCombinations(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        int digits = up.charAt(0) - '0';
        if(digits == 7)
        {
            for (int i = (digits-2)*3; i <= (digits-1)*3; i++) {
                char ch = (char)('a' + i );
                list.addAll(letterCombinations(p+ch,up.substring(1)));


            }

        }
        if(digits == 8)
        {
            for (int i = ((digits-2)*3) + 1; i <= (digits-1)*3; i++) {
                char ch = (char)('a' + i );
                list.addAll(letterCombinations(p+ch,up.substring(1)));


            }

        }
        if(digits == 9)
        {
            for (int i = ((digits-2)*3) +1; i <= ((digits-1)*3) + 1; i++) {
                char ch = (char)('a' + i );
                list.addAll(letterCombinations(p+ch,up.substring(1)));


            }

        }
        for (int i = (digits-2)*3; i < (digits-1)*3; i++) {
            char ch = (char)('a' + i );
            list.addAll(letterCombinations(p+ch,up.substring(1)));


        }
        return list;


    }
}
