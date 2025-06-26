package com.abhay;

import java.util.Stack;

public class leet345 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));

    }

    public static String reverseVowels(String s) {
        Stack<Character> vs = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u' )
            {
                vs.push(s.charAt(i));

            }
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||s.charAt(i) == 'O' || s.charAt(i) == 'U')
            {
                vs.push(s.charAt(i));
            }
        }

        vs.reversed();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u' )
            {
                Character n = vs.pop();
                str.append(n);

            }
            else if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||s.charAt(i) == 'O' || s.charAt(i) == 'U')
            {
                Character n = vs.pop();
                str.append(n);
            }

            else{
                str.append(s.charAt(i));
            }
        }

        String ans = str.toString();
        return ans;
    }
}
