package com.abhay;

public class leet28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle) == true)
       {
           int s1 = 0;
           int s2 = 0;
           while(s2 < needle.length())
           {
               if(haystack.charAt(s1) == needle.charAt(s2))
               {
                   if(haystack.charAt(s1 + (needle.length()-1)) == needle.charAt(needle.length() -1 ))
                   {
                       return s1;
                   }
                   else
                   {
                       s1++;
                   }

               }

               else{
                   s1++;
               }
           }

       }


       return -1;
    }
}
