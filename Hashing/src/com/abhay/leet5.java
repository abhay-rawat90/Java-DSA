package com.abhay;

public class leet5 {
    public static void main(String[] args) {
        int columnNumber = 52;
        System.out.println(convertToTitle(columnNumber));


    }
    public static String convertToTitle(int columnNumber) {
        if (columnNumber <= 26) {
            char c = (char) (64 + columnNumber);
            String s = String.valueOf(c);
            return s;
        }

        String s = "";

        while (columnNumber > 0) {
            int a = columnNumber % 26;
            if (a == 0) {
                a = 26; // Handle cases like Z correctly
                columnNumber--; // Adjust the column number for 1-based indexing
            }
            char c = (char) (64 + a);
            s = c + s; // Prepend the character
            columnNumber /= 26;
        }

        return s;


    }

}
