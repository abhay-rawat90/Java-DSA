package com.abhay;

public class palindrome {
    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(ispalindrome(str));

    }
    static boolean ispalindrome(String s)
    {
        if (s.length()==0 || s == null)
        {
            return true;
        }
       s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9 ]","");
        s = s.replaceAll("\\s","");
        s = s.strip();
//        for (int i = 0; i < str.length()/2; i++) {
//            char start = str.charAt(i);
//            char end = str.charAt(str.length()-1-i);
//            if(start != end)
//            {
//                return false;
//            }
//
//        }
//        return true;
        int start =0;
        int end = s.length()-1;
        while(start<end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            else
            {
                start++;
                end--;

            }
        }
        return true;
    }
}
