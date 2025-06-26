package com.abhay;

public class leet14 {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if(i < word1.length() )
            {
                str.append(word1.charAt(i));
            }
            if(i < word2.length() )
            {
                str.append(word2.charAt(i));
            }
        }

        String str1 = str.toString();
        return str1;

    }
}
