package com.abhay.subset;

import java.util.ArrayList;
import java.util.Locale;

public class perm {
    public static void main(String[] args) {
        System.out.println(perm1("","abcd"));
        System.out.println(permutcount2("","abcd",0));

    }

    static void permut(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <p.length() + 1 ; i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permut(f+ch+s,up.substring(1));

        }


    }

    static ArrayList<String> perm1(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =new ArrayList<>();
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            left.addAll(perm1(f+ch+s,up.substring(1)));

        }
        return left;


    }

    static int permutcount(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <p.length() + 1 ; i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutcount(f+ch+s,up.substring(1));

        }
        return count;


    }
    static int permutcount2(String p,String up,int count)
    {
        if(up.isEmpty())
        {
            return count+1;
        }
        char ch = up.charAt(0);
        int newcount =0;

        for (int i = 0; i <p.length() + 1 ; i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            newcount += permutcount2(f+ch+s,up.substring(1),count);

        }
        return count + newcount;


    }
}
