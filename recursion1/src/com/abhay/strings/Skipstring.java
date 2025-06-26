package com.abhay.strings;

public class Skipstring {
    public static void main(String[] args) {
        System.out.println(skipappnotapple("bcdapplefg"));

    }
    static String skip1(String up)
    {
        if(up.isEmpty())
        {
            return("");
        }

        if(up.startsWith("apple"))
        {
            return skip1(up.substring(5));
        }
        else {
            return up.charAt(0)+skip1(up.substring(1));
        }

    }

    static String skipappnotapple(String up)
    {
        if(up.isEmpty())
        {
            return("");
        }

        if(up.startsWith("app") && !up.startsWith("apple"))
        {
            return skipappnotapple(up.substring(3));
        }
        else {
            return up.charAt(0)+skipappnotapple(up.substring(1));
        }

    }
}
