package com.abhay.strings;

public class Basic {
    public static void main(String[] args) {
        System.out.println(skip1("baccad"));

    }

    static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'c')
        {
            skip(p,up.substring(1));
        }
        else {
            skip(p + ch,up.substring(1));
        }

    }

    static String skip1(String up)
    {
        if(up.isEmpty())
        {
            return("");
        }

        char ch = up.charAt(0);
        if(ch == 'c')
        {
            return skip1(up.substring(1));
        }
        else {
            return ch + skip1(up.substring(1));
        }

    }
}
