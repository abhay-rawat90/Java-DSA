package com.abhay;




public class leet38 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if(n == 1)
        {
            return "1";
        }
        String s2 = "";
        int count = 1;
        String s = countAndSay(n-1);



        for (int i = 0; i < s.length(); i = i + count) {
            char n1 = s.charAt(i);
            count = 1;
            {
                for (int j = i + 1; j < s.length() ; j++) {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        count++;
                    }
                    else
                    {
                        break;
                    }

                }

                s2 = s2 + count + String.valueOf(n1) ;

            }
        }

        return s2;
    }
}
