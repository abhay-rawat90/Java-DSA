package com.abhay;

import java.util.Stack;

public class leet2390 {
    public static void main(String[] args) {
        String s ="leet**cod*e";
        System.out.println(removeStars(s));

    }

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();



    }
}
